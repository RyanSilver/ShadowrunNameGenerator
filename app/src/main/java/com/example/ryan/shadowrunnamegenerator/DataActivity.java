package com.example.ryan.shadowrunnamegenerator;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import android.view.*;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Ryan on 11``/18/2017.
 */

public class DataActivity extends Activity {
    TextView name;
    TextView desc;
    TextView race;
    TextView pers;
    static String selectedItem;
    private ListView listView;
    private ArrayList<String> listItems;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        selectedItem=null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);
        name=(TextView) findViewById(R.id.save_name);
        desc=(TextView) findViewById(R.id.save_discription);
        race=(TextView) findViewById(R.id.save_race);
        pers=(TextView) findViewById(R.id.save_per);
        if (savedInstanceState != null){
            name.setText(savedInstanceState.getString("name"));
            desc.setText(savedInstanceState.getString("desc"));
            race.setText(savedInstanceState.getString("race"));
            pers.setText(savedInstanceState.getString("pers"));
            MainActivity.loadMode=savedInstanceState.getBoolean("loadMode");
        }
        if(MainActivity.loadMode){
            setContentView(R.layout.activity_load);
            listView=(ListView) findViewById(R.id.list_view1);
            displayList(null);
            try{
                if (savedInstanceState.getString("selectedItem")!=null){
                    selectedItem=savedInstanceState.getString("selectedItem");
                    setContentView(R.layout.activity_view_save);
                    TextView w= findViewById(R.id.view_name);
                    w.setText(selectedItem.split(",")[0]);
                    w=findViewById(R.id.view_desc);
                    w.setText(selectedItem.split(",")[1]);
                    w=findViewById(R.id.view_race);
                    w.setText(selectedItem.split(",")[2]);
                    w=findViewById(R.id.view_pers);
                    w.setText(selectedItem.split(",")[3]);
                }
            }catch (Exception e){}

        }
        if (savedInstanceState != null){
            name.setText(savedInstanceState.getString("name"));
            desc.setText(savedInstanceState.getString("desc"));
            race.setText(savedInstanceState.getString("race"));
            pers.setText(savedInstanceState.getString("pers"));
        }
        if(MainActivity.toSave!=null)
            name.setText(MainActivity.toSave);

    }
    protected void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putString("name",name.getText().toString());
        savedInstanceState.putString("desc",desc.getText().toString());
        savedInstanceState.putString("race",race.getText().toString());
        savedInstanceState.putString("pers",pers.getText().toString());
        savedInstanceState.putBoolean("loadMode",MainActivity.loadMode);
        savedInstanceState.putString("selectedItem",selectedItem);
    }
    public SharedPreferences getSP(){
        return this.getPreferences(Context.MODE_APPEND);
    }
    public void buttonPressed(View view){

        SharedPreferences sharedPref = this.getPreferences(Context.MODE_APPEND);
        Log.d("appPrefContext","save "+this.getPreferences(Context.MODE_APPEND).toString());
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(name.getText().toString()+","+desc.getText().toString()+","+race.getText().toString()+","+pers.getText().toString() , name.getText().toString()+","+desc.getText().toString()+","+race.getText().toString()+","+pers.getText().toString() );
        editor.commit();
        Log.d("SP logging name","he done hit that button"+sharedPref.getAll().size()+ this.getPreferences(Context.MODE_APPEND).toString());
        for (int i = 0; i < sharedPref.getAll().size(); i++) {
            Log.d("SP logging name",sharedPref.getAll().values().toArray()[i].toString());
        }
        onBackPressed();
    }
    private class ListItemHandler
            implements AdapterView.OnItemClickListener {
        public void onItemClick(AdapterView<?> parent, View view,
                                int position, long id ) {
            String selectedItem = listItems.get( position );
            DataActivity.selectedItem=selectedItem;
            setContentView(R.layout.activity_view_save);
            TextView w= findViewById(R.id.view_name);
            w.setText(selectedItem.split(",")[0]);
            w=findViewById(R.id.view_desc);
            w.setText(selectedItem.split(",")[1]);
            w=findViewById(R.id.view_race);
            w.setText(selectedItem.split(",")[2]);
            w=findViewById(R.id.view_pers);
            w.setText(selectedItem.split(",")[3]);


        }
    }
    public void clearNames(View view){
        SharedPreferences sharedPref=this.getPreferences(Context.MODE_APPEND);
        sharedPref.edit().clear().commit();
        displayList(null);
    }



    public void displayList( ArrayList<String> items ) {
//        DataActivity a=new DataActivity();
        //SharedPreferences sharedPref = a.getSP();
//
//        Log.d("appPrefContext","load " + a.getSP().toString());
//        Log.d("SP logging name","he done hit that button"+sharedPref.getAll().size());
//       for (int i = 0; i < sharedPref.getAll().size(); i++) {
//           Log.d("SP logging name",sharedPref.getAll().values().toArray()[i].toString());
//
//        }
        items=new ArrayList<>();
        listItems = items;

        try {
            SharedPreferences sharedPref=this.getPreferences(Context.MODE_APPEND);

            if ( sharedPref.getAll().size() != 0 ) {
                for (int i = 0; i < sharedPref.getAll().size(); i++) {
                    items.add(sharedPref.getAll().values().toArray()[i].toString());
                    Log.d("SP logging name",sharedPref.getAll().values().toArray()[i].toString());

                }
            }
        }
        catch (Exception e) {
            Log.d("login activity", "File not found: " + e.toString());
        }
        if( items!=null ) {
            // Build ArrayList of titles to display
            ArrayList<String> titles = new ArrayList<String>( );
            for (int i = 0; i < items.size(); i++) {
                try{titles.add( items.get(i).split(",")[0] );

                }catch(Exception e){}
            }{

            }


            ArrayAdapter<String> adapter = new ArrayAdapter<String>( this,
                    android.R.layout.simple_list_item_1, titles );
            listView.setAdapter( adapter );
            DataActivity.ListItemHandler lih = new DataActivity.ListItemHandler( );
            listView.setOnItemClickListener( lih );
        } else
            Toast.makeText( this, "Sorry - No data found",
                    Toast.LENGTH_LONG ).show( );

        Log.d("inapp", "display list exit");
    }

}

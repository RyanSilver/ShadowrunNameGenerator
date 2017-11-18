package com.example.ryan.shadowrunnamegenerator;

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
import java.util.ArrayList;
import android.view.*;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class MainActivity extends AppCompatActivity {
    static boolean loadMode=true;
    static String toSave;
    private ListView displayListView;
    private ArrayList<String> listcontents;
    public static nameGenController controller;
    private static boolean rsson;
    private final String URL
            = "http://litehouseproduction.com/mile-high-news-blog?format=rss";
    private ListView listView;
    private ArrayList<Item> listItems;
    String currentLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        controller=new nameGenController();
        setContentView(R.layout.activity_main);
        rsson=false;
        if (savedInstanceState!=null){
            //reload the list view from memory
            try {
                controller.resetContext();
                controller.buildContext(savedInstanceState.getString("controllerContext"));
                Log.d("context",""+controller.getContext().length());
                Log.d("context",""+controller.getContext());
                switch (controller.getContext().length()){
                    case 0:
                        //user is at main activity or rss activity.
                        if(savedInstanceState.getBoolean("rss")){
                            rsson=true;
                            setContentView( R.layout.activity_rss );
                            listView = (ListView) findViewById( R.id.list_view );
                            ParseTask task = new ParseTask( this );
                            task.execute( URL );

                        }
                        break;
                    case 3:
                        //user is at the origin or sov screen
                        if(controller.getContext().charAt(0)=='S'){
                            //at SOV
                            setContentView(R.layout.activity_sovereignty);
                        }else{
                            setContentView(R.layout.activity_origin);
                        }
                        break;
                    case 6:
                        //user is done with Ori or sov and wants to select gender
                        setContentView(R.layout.activity_gender);
                        break;
                    default:
                        //user has already generated names
                        setContentView(R.layout.activity_generated);
                        TextView tv1=(TextView) findViewById(R.id.gen_name1);
                        tv1.setText(savedInstanceState.getString("gen_name1"));
                        TextView tv2=(TextView) findViewById(R.id.gen_name2);
                        tv2.setText(savedInstanceState.getString("gen_name2"));
                        TextView tv3=(TextView) findViewById(R.id.gen_name3);
                        tv3.setText(savedInstanceState.getString("gen_name3"));
                        TextView tv4=(TextView) findViewById(R.id.gen_name4);
                        tv4.setText(savedInstanceState.getString("gen_name4"));
                        TextView tv5=(TextView) findViewById(R.id.gen_name5);
                        tv5.setText(savedInstanceState.getString("gen_name5"));
                        break;

                }
            }catch(Exception e){
                e.printStackTrace();
                setContentView(R.layout.activity_main);}
        }
        else{
            //initialize the list

        }

        Log.d("method","OnCreate finished");
    }
    private void displayNames(){
        nameGenModel generator=new nameGenModel();
        //code to go to name display screen and populate it
        Log.d("MainActivity","display names called");
        setContentView(R.layout.activity_generated);
        String context=controller.getContext();
        TextView tv1=(TextView) findViewById(R.id.gen_name1);
        tv1.setText(generator.generateName(context));
        TextView tv2=(TextView) findViewById(R.id.gen_name2);
        tv2.setText(generator.generateName(context));
        TextView tv3=(TextView) findViewById(R.id.gen_name3);
        tv3.setText(generator.generateName(context));
        TextView tv4=(TextView) findViewById(R.id.gen_name4);
        tv4.setText(generator.generateName(context));
        TextView tv5=(TextView) findViewById(R.id.gen_name5);
        tv5.setText(generator.generateName(context));
    }
    public void buttonPressed(View view){
        switch(view.getId()){
            case R.id.main_origin:
                controller.resetContext();
                controller.buildContext("Ori");
                //set screen to origin list
                setContentView(R.layout.activity_origin);
                break;
            case R.id.main_sovereignity:
                controller.resetContext();
                controller.buildContext("Sov");
                //set screen to sovereignty list
                setContentView(R.layout.activity_sovereignty);
                break;
            case R.id.main_artists:
                controller.resetContext();
                controller.buildContext("Artists");

                displayNames();
                break;
            case R.id.main_bars:
                controller.resetContext();
                controller.buildContext("Bars");
                displayNames();
                break;
            case R.id.main_corporations:
                controller.resetContext();
                controller.buildContext("Corporations");
                displayNames();
                break;
            case R.id.main_esoteric:
                controller.resetContext();
                controller.buildContext("Esoteric");
                displayNames();
                break;
            case R.id.main_fastFood:
                controller.resetContext();
                controller.buildContext("FastFood");
                displayNames();
                break;
            case R.id.main_gangs:
                controller.resetContext();
                controller.buildContext("Gangs");
                displayNames();
                break;
            case R.id.main_movies:
                controller.resetContext();
                controller.buildContext("Trids");
                displayNames();
                break;
            case R.id.main_mrJohnson:
                controller.resetContext();
                controller.buildContext("MrJohnson");
                displayNames();
                break;
            case R.id.main_runners:
                controller.resetContext();
                controller.buildContext("Runners");
                displayNames();
                break;
            case R.id.main_shops:
                controller.resetContext();
                controller.buildContext("Shops");
                displayNames();
                break;
            case R.id.sov_ags:
                controller.buildContext("Ags");
                //set to gender selection
                setContentView(R.layout.activity_gender);
                break;
            case R.id.sov_aztlan:
                controller.buildContext("Azt");
                setContentView(R.layout.activity_gender);
                break;
            case R.id.sov_ucas:
                controller.buildContext("Uca");
                setContentView(R.layout.activity_gender);
                break;
            case R.id.sov_cas:
                controller.buildContext("Cas");
                setContentView(R.layout.activity_gender);
                break;
            case R.id.sov_hongKong:
                controller.buildContext("Hon");
                setContentView(R.layout.activity_gender);
                break;
            case R.id.gender_both:
                controller.buildContext("0");
                displayNames();
                break;
            case R.id.gender_male:
                controller.buildContext("1");
                displayNames();
                break;
            case R.id.gender_female:
                controller.buildContext("2");
                displayNames();
                break;
            case R.id.gen_refresh:
                displayNames();
                break;
            case R.id.main_rss:
                //Looper.prepare();
                try{
                    listItems.clear();
                }catch (Exception e){}
                controller.resetContext();
                rsson=true;
                setContentView( R.layout.activity_rss );
                listView = (ListView) findViewById( R.id.list_view );
                ParseTask task = new ParseTask( this );
                task.execute( URL );
                this.overridePendingTransition(R.anim.fade_in,0);
                break;
            default:
                Log.d("MainActivity","Unsupported button pressed");
                break;
        }
        Log.d("MainActivity", "Button pressed exit");
    }
    public void onClickText(View view){
        loadMode=false;
        try {
            TextView v;
            v= (TextView) view;
            switch (view.getId()) {
                case R.id.gen_name1:
                    toSave = (String) v.getText();
                    break;
                case R.id.gen_name2:
                    toSave = (String) v.getText();
                    break;
                case R.id.gen_name3:
                    toSave = (String) v.getText();
                    break;
                case R.id.gen_name4:
                    toSave = (String) v.getText();
                    break;
                case R.id.gen_name5:
                    toSave = (String) v.getText();
                    break;
            }

            Intent dataIntent = new Intent(this, DataActivity.class);
            this.startActivity(dataIntent);
            overridePendingTransition(R.anim.fade_in, 0);
        }catch (Exception e){loadMode=true;}
    }
    private class ListItemHandler
            implements AdapterView.OnItemClickListener {
        public void onItemClick(AdapterView<?> parent, View view,
                                int position, long id ) {
            Item selectedItem = listItems.get( position );
            Uri uri = Uri.parse( selectedItem.getLink( ) );
            Intent browserIntent = new Intent( Intent.ACTION_VIEW, uri );
            startActivity( browserIntent );
        }
    }
    public void displayList( ArrayList<Item> items ) {
        Log.d("inapp", items.toString());
        listItems = items;
        if( items != null ) {
            // Build ArrayList of titles to display
            ArrayList<String> titles = new ArrayList<String>( );
            for( Item item : items ){
                try{titles.add( item.toString( ) );}catch(Exception e){}
            }


            ArrayAdapter<String> adapter = new ArrayAdapter<String>( this,
                    android.R.layout.simple_list_item_1, titles );
            listView.setAdapter( adapter );
            MainActivity.ListItemHandler lih = new MainActivity.ListItemHandler( );
            listView.setOnItemClickListener( lih );
        } else
            Toast.makeText( this, "Sorry - No data found",
                    Toast.LENGTH_LONG ).show( );

        Log.d("inapp", "display list exit");
    }


    @Override
    public void onBackPressed() {
        controller.resetContext();
        setContentView(R.layout.activity_main);
        //super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState){
        TextView test=(TextView) findViewById(R.id.gen_name1);
        savedInstanceState.putString("controllerContext",controller.getContext());
        savedInstanceState.putBoolean("rss",rsson);
        try{
            savedInstanceState.putString("gen_name1",(String) test.getText());
            test=(TextView) findViewById(R.id.gen_name2);
            savedInstanceState.putString("gen_name2",(String) test.getText());
            test=(TextView) findViewById(R.id.gen_name3);
            savedInstanceState.putString("gen_name3",(String) test.getText());
            test=(TextView) findViewById(R.id.gen_name4);
            savedInstanceState.putString("gen_name4",(String) test.getText());
            test=(TextView) findViewById(R.id.gen_name5);
            savedInstanceState.putString("gen_name5",(String) test.getText());
        }catch (Exception e){
            savedInstanceState.putString("gen_name1","");
            savedInstanceState.putString("gen_name2","");
            savedInstanceState.putString("gen_name3","");
            savedInstanceState.putString("gen_name4","");
            savedInstanceState.putString("gen_name5","");
        }


    }


}

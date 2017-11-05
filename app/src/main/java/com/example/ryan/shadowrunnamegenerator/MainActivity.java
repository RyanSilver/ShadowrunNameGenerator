package com.example.ryan.shadowrunnamegenerator;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import java.util.ArrayList;
import android.view.*;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ListView displayListView;
    private ArrayList<String> listcontents;
    public static nameGenController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controller=new nameGenController();
        if (savedInstanceState!=null){
            //reload the list view from memory
            listcontents.clear();

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
        view.equals(findViewById(R.id.main_origin));
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
                controller.buildContext("Aztlan");
                setContentView(R.layout.activity_gender);
                break;
            case R.id.sov_ucas:
                controller.buildContext("Ucas");
                setContentView(R.layout.activity_gender);
                break;
            case R.id.sov_cas:
                controller.buildContext("Cas");
                setContentView(R.layout.activity_gender);
                break;
            case R.id.sov_hongKong:
                controller.buildContext("HongKong");
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
            //as of right now model does not support weapon name generation
            //case R.id.main_weapons:
              //  controller.resetContext();
                //controller.buildContext("Weapons");
                //displayNames();
                //break;

            default:
                Log.d("MainActivity","Unsupported button pressed");
                break;
        }
        Log.d("MainActivity",controller.getContext());
    }
    @Override
    public void onBackPressed() {
        controller.resetContext();
        setContentView(R.layout.activity_main);
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putString("listItem0",listcontents.get(0));//...

    }


}

package com.example.ryan.shadowrunnamegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

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
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putString("listItem0",listcontents.get(0));//...

    }


}

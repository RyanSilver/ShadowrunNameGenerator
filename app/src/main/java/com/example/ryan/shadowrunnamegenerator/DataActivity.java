package com.example.ryan.shadowrunnamegenerator;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Ryan on 11/18/2017.
 */

public class DataActivity extends Activity {
    TextView name;
    TextView desc;
    TextView race;
    TextView pers;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);
        name=(TextView) findViewById(R.id.save_name);
        desc=(TextView) findViewById(R.id.save_discription);
        race=(TextView) findViewById(R.id.save_race);
        pers=(TextView) findViewById(R.id.save_per);
        if(MainActivity.toSave!=null)
            name.setText(MainActivity.toSave);
        if (savedInstanceState != null){
            name.setText(savedInstanceState.getString("name"));
            desc.setText(savedInstanceState.getString("desc"));
            race.setText(savedInstanceState.getString("race"));
            pers.setText(savedInstanceState.getString("pers"));
        }
    }
    protected void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putString("name",name.getText().toString());
        savedInstanceState.putString("desc",desc.getText().toString());
        savedInstanceState.putString("race",race.getText().toString());
        savedInstanceState.putString("pers",pers.getText().toString());

    }
    public void buttonPressed(View view){

    }

}

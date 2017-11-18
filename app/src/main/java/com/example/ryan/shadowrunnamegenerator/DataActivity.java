package com.example.ryan.shadowrunnamegenerator;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Ryan on 11/18/2017.
 */

public class DataActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(MainActivity.loadMode){
            setContentView(R.layout.activity_load);
        }else{
            setContentView(R.layout.activity_save);
        }

    }

}

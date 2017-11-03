package com.example.ryan.shadowrunnamegenerator;

import java.util.ArrayList;
/**
 * Created by Ryan on 11/3/2017.
 */

public class nameGenController {
    private String context;
    private nameGenModel nameGenerator;

    public nameGenController (){
        nameGenerator=new nameGenModel();
    }
    public void buildContext(String context){
        if(context.equals("0")||context.equals("1")||context.equals("2")){
            this.context+=" "+context;
        }
        else {
            this.context+=context;
        }
    }//build context
    public String getContext(){
        return context;
    }
    public void resetContext(){
        context="";
    }


}

package com.example.ryan.shadowrunnamegenerator;

import android.os.AsyncTask;
import android.widget.Toast;
import android.util.Log;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class ParseTask extends AsyncTask<String, Void, ArrayList<Item>> {
  private MainActivity activity;
	
  public ParseTask(MainActivity fromActivity ) {
    activity = fromActivity; 
  }

  protected ArrayList<Item> doInBackground(String... urls  ) {
    try {
      Log.d("inapp",urls[0]);
      SAXParserFactory factory = SAXParserFactory.newInstance( );
      SAXParser saxParser = factory.newSAXParser( );
      SAXHandler handler = new SAXHandler( );
      saxParser.parse( urls[0], handler );
      return handler.getItems( ); 
    } catch( Exception e )  {
//      Toast.makeText( activity, "Sorry - There was a problem parsing",
//          Toast.LENGTH_LONG ).show( );
      return null;
    }    
  }

  protected void onPostExecute ( ArrayList<Item> returnedItems ) {
    Log.d("inapp","bout to display list");
    activity.displayList( returnedItems );
  }
}
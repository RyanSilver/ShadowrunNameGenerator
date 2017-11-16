package com.example.ryan.shadowrunnamegenerator;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class SAXHandler extends DefaultHandler {
  private boolean validText;
  private String element = "";
  private Item currentItem;
  private ArrayList<Item> items;

  public SAXHandler( ) {
    validText = false;
    items = new ArrayList<Item>( );
  }

  public ArrayList<Item> getItems( ) { return items; }

  public void startElement(String uri, String localName,
                           String startElement, Attributes attributes )
                            throws SAXException {
    validText = true;
    element = startElement;
    if( startElement.equals( "allPOV" ) ) // start current pov
      currentItem = new Item(attributes.getValue("infinitiveSpanish"),attributes.getValue("infinitiveEnglish") , "" );

  }

  public void endElement(String uri, String localName,
                         String endElement ) throws SAXException {
    validText = false;
    if( endElement.equals( "allPOV" ) ) // add current item to items
      items.add( currentItem );
  }
  public String getValue(String qName){
    return "";
  }

  public void characters( char ch [], int start,
                          int length ) throws SAXException {
    if( currentItem != null && element.equals( "conj" ) && validText )
      currentItem.setFirstPersonPresent( new String( ch, start, length ) );
  }
}


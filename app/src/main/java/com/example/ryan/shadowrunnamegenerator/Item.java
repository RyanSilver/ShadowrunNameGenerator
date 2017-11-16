package com.example.ryan.shadowrunnamegenerator;

public class Item {
  private String title;
  private String link;
  private String description;

  public Item(String title,String link, String description ) {
    this.title=title;
    this.link=link;
    this.description =description;
  }
  //Getters and setters...
  public String getTitle(){
    return title;
  }
  public void setTitle(String title){
    this.title=title;
  }
  public String getLink(){
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  //to string
  public String toString( ) {
    return title;
  }
}
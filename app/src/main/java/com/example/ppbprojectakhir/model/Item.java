package com.example.ppbprojectakhir.model;

public class Item {
    private String itemName;
    private String itemDescription;
    private int img;
    public Item(String name, String description, int image){
        this.itemName = name;
        this.itemDescription = description;
        this.img = image;
    }
    public String getItemName(){
        return this.itemName;
    }
    public String getItemDescription(){
        return this.itemDescription;
    }
    public int getImg(){
        return  this.img;
    }
}

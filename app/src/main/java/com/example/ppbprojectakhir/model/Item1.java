package com.example.ppbprojectakhir.model;

public class Item1 {
    private String nomer;
    private String itemName;
    private String itemDescription;
    public Item1(String no, String name, String description){
        this.nomer = no;
        this.itemName = name;
        this.itemDescription = description;
    }

    public String getNomer() {
        return this.nomer;
    }
    public String getItemName(){
        return this.itemName;
    }
    public String getItemDescription(){
        return this.itemDescription;
    }
}

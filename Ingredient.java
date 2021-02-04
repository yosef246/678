package com.company;

public class Ingredient {

    private String ingID;
    private String ingName;
    private Double ingPrice;


    public Ingredient(String ingID, String ingName, Double ingPrice){

        this.ingID = ingID;
        this.ingName = ingName;
        this.ingPrice = ingPrice;
    }
    public String getIngID(){

        return ingID;
    }
    public String getIngName(){

        return ingName;
    }
    public Double getIngPrice(){

        return ingPrice;
    }
    public void setIngID(String i){

        this.ingID = ingID;
    }
    public void setIngName(String n){

        this.ingName = ingName;
    }
    public void setIngPrice(Double p){

        this.ingPrice = ingPrice ;
    }
}

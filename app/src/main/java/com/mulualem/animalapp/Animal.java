package com.mulualem.animalapp;

public class Animal {
    String name;
    int image;

    public Animal(String name,int image){
        this.name = name;
        this.image = image;

    }
    // getter and setter
    public String getName() {

        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getImage(){
        return image;
    }

    public void setImage(int image){
        this.image = image;
    }
}
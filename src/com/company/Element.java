package com.company;

public class Element {
    public String key;
    public String value;
    public Element next;


    public Element(String key, String value){
        this.key = key;
        this.value = value;
    }

    public void displayNode() {
        System.out.print("(     " + key + ", " + value + "   ) ");
    }
}


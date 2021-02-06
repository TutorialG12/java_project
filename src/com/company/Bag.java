package com.company;

import java.util.ArrayList;

public class Bag<T> {
    ArrayList<T> bag = new ArrayList<>();

    public void add(T object){
        this.bag.add(object);
    }
    public void remove(T object){
        this.bag.remove(object);
    }

    public void clear(){
        this.bag.clear();
    }
}

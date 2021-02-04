package com.company;

import java.util.ArrayList;

public class Register {

    ArrayList<Nameable> studentRegister = new ArrayList<>();

    public Register(ArrayList<Nameable> Persons){
        this.studentRegister = Persons;
    }

    public ArrayList<String> getRegister(){
        ArrayList<String> studentNames = new ArrayList<>();
        for(Nameable people : studentRegister){
            studentNames.add(people.getname());
        }
        return studentNames;
    }
}

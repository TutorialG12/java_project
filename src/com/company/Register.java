package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Register {

    ArrayList<Nameable> studentRegister = new ArrayList<>();

    public Register(ArrayList<Nameable> Persons){
        this.studentRegister = Persons;
    }

    public ArrayList<String> getRegisterLevel(Level level){
        ArrayList<String> studentNames = new ArrayList<>();
        for(Nameable people : studentRegister){
            Student aStudent  = (Student) people;
            if(aStudent.getLevel() == level){
                studentNames.add(people.getname());
            }
        }
        return studentNames;
    }

    public ArrayList<String> getRegister(){
        ArrayList<String> studentNames = new ArrayList<>();
        for(Nameable people : studentRegister){
            studentNames.add(people.getname());
        }
        return studentNames;
    }

    public String printReport (){
        ArrayList<Student> studentRegisterLevel  = new ArrayList<>();
        for(Nameable people : studentRegister){
            Student aStudent  = (Student) people;
            studentRegisterLevel.add(aStudent);
        }
        System.out.println(studentRegisterLevel);
        Collections.sort(studentRegisterLevel, new NameOrder());
        System.out.println(studentRegisterLevel);
        String stringRep = "Student Name>>>>>>>>>>>Level\n";
        for(Student astudent : studentRegisterLevel){
            stringRep = stringRep + astudent.getname() + ">>>>>>>>>>>>" + astudent.getLevel() + "\n";
        }
        return stringRep;
    }
}

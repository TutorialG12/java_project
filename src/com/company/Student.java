package com.company;

import java.util.ArrayList;


public class Student implements Nameable {
    protected ArrayList<Double> grades;
    private String name;

    public Student(ArrayList<Double> grades) {
        this.grades = grades;
    }
    public Student(ArrayList<Double> grades, String name){
        this(grades);
        this.name = name;
    }

    public double getAverageGrade () {
        double total = 0;
        for (double i : this.grades) {
            total += i;
        }
        return  total / this.grades.size();
    }

    public String getname(){
        return this.name;
    }
}

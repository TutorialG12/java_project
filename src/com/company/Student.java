package com.company;

import java.util.ArrayList;


public class Student implements Nameable,HasLevel {
    protected ArrayList<Double> grades;
    private String name;
    private Level level;

    public Student(ArrayList<Double> grades) {
        this.grades = grades;
    }
    public Student(ArrayList<Double> grades, String name){
        this(grades);
        this.name = name;
    }

    public Student(ArrayList<Double> grades, String name, Level level){
        this(grades, name);
        this.level = level;
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

    public Level getLevel(){
        return this.level;
    }
}

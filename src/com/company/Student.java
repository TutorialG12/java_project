package com.company;

import java.util.List;
import java.util.stream.DoubleStream;


public class Student implements Nameable,HasLevel  {
    protected List<Double> grades;
    private String name;
    private Level level;

    public Student(List<Double> grades) {
        this.grades = grades;
    }
    public Student(List<Double> grades, String name){
        this(grades);
        this.name = name;
    }

    public Student(List<Double> grades, String name, Level level){
        this(grades, name);
        this.level = level;
    }

    public double getAverageGrade () {
        double total = 0;
        for (double grade : this.grades) {
            total += grade;
        }
        return  total / this.grades.size();
    }

    public DoubleStream studentGrades() {
        return grades.stream().mapToDouble(grade -> grade);
    }

    public String getname(){
        return this.name;
    }

    public Level getLevel(){
        return this.level;
    }



}

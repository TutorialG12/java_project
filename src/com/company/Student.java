package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {
    protected ArrayList<Double> grades;

    public Student(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public double getAverageGrade () {
        double total = 0;
        for (double i : this.grades) {
            total += i;
        }
        return  total / this.grades.size();
    }
}

package com.company;

import java.util.List;

public class Student {
    private List<Double> grades;

    public Student(List<Double> grades) {
        this.grades = grades;
    }

    public double getAverageGrade () {
        double total = 0;
        for (double i : this.grades) {
            total += i;
        }
        double average = total / this.grades.size();

        return  average;
    }
}

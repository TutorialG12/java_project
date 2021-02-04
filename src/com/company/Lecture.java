package com.company;

import java.util.ArrayList;

public class Lecture {
    protected ArrayList<Student> students = new ArrayList<>();

    public void enter( Student student) {
        this.students.add(student);
    }

    public double getHighestAverageGrade() {
        double highest = 0;
        for (Student i: this.students ) {
            double current = i.getAverageGrade();
            if (current > highest) {
                highest = current;
            }
        }
        return highest;
    }
}

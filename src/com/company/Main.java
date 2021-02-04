package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Double> grade = new ArrayList<Double>();
        grade.add(7.0);
        grade.add(5.8);
        grade.add(4.5);
        grade.add(4.8);
        grade.add(7.8);

        ArrayList<Double> grade1 = new ArrayList<Double>();
        grade1.add(4.0);
        grade1.add(1.2);
        grade1.add(5.6);
        grade1.add(7.8);
        grade1.add(9.5);

        Student david = new Student(grade);
        Student nunana = new Student(grade1);

        Lecture physics = new Lecture();
        physics.enter(david);
        physics.enter(nunana);

        double test = physics.getHighestAverageGrade();

        System.out.println(test);

    }
}

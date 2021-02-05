package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    ArrayList<Double> grades = new ArrayList<Double>();


    @Test
    void getAverageGrade() {
        grades.add(7.0);
        grades.add(5.8);
        grades.add(4.5);
        grades.add(4.8);
        grades.add(7.8);

        Student Nunana = new Student(grades);

        double averageTest = (7.0+5.8+4.5+4.8+7.8)/5;

        assertEquals(averageTest, Nunana.getAverageGrade());
    }

    @Test
    void getLevel() {
        grades.add(7.0);
        grades.add(5.8);
        grades.add(4.5);
        grades.add(4.8);
        grades.add(7.8);

        Student David = new Student(grades,"David",Level.LEVEL300);
        assertEquals(Level.LEVEL300,David.getLevel());
    }
}
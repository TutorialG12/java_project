package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BagOfStudentsTest {
    List<Double> score = Arrays.asList(7.5, 5.6,8.2,8.1,4.5,7.6,1.6,8.6);
    ArrayList<Double> grades = new ArrayList<>();
    ArrayList<Student> empty = new ArrayList<>();
    Student James = new Student(grades, "James", Level.LEVEL100);
    Student Evans = new Student(grades, "Evans", Level.LEVEL200);
    Student Quil = new Student(grades, "Quil", Level.LEVEL300);
    Student Joy = new Student(grades, "Joy", Level.LEVEL100);
    Student Ben = new Student(grades, "Ben", Level.LEVEL200);
    Student Samantha = new Student(grades, "Samantha", Level.LEVEL400);
    Student Mercy = new Student(grades, "Mercy", Level.LEVEL100);
    Student Eric = new Student(grades, "Eric", Level.LEVEL400);
    Student George = new Student(grades, "George", Level.LEVEL100);
    Student Kevin = new Student(grades, "Kevin", Level.LEVEL300);
    Student Matilda = new Student(grades, "Matilda", Level.LEVEL300);
    Student Tom = new Student(grades, "Tom", Level.LEVEL100);

    List<Student> studentList = Arrays.asList(James, Evans, Quil, Joy, Ben, Samantha, Mercy, Eric, George, Kevin, Matilda, Tom);
    BagOfStudents aBag = new BagOfStudents();
    @Test
    void add() {
    }

    @Test
    void remove() {
    }

    @Test
    void clear() {
        grades.addAll(score);
        aBag.add(James);
        aBag.add(Evans);
        aBag.add(Kevin);
        aBag.add(Tom);
        aBag.add(George);
        aBag.add(Ben);
        aBag.clear();
        assertEquals(empty.isEmpty(), aBag.getStudents().isEmpty());
    }
}
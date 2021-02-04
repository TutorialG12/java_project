package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    List<Double> score = Arrays.asList(7.5, 5.6,8.2,8.1,4.5,7.6,1.6,8.6);
    List<String> namesList = Arrays.asList("James", "Evans", "Quil", "Joy", "Ben", "Samantha", "Mercy", "Eric", "George", "Kevin", "Matilda", "Tom");


    ArrayList<Double> grades = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Nameable> students = new ArrayList<>();

    Student James = new Student(grades, "James");
    Student Evans = new Student(grades, "Evans");
    Student Quil = new Student(grades, "Quil");
    Student Joy = new Student(grades, "Joy");
    Student Ben = new Student(grades, "Ben");
    Student Samantha = new Student(grades, "Samantha");
    Student Mercy = new Student(grades, "Mercy");
    Student Eric = new Student(grades, "Eric");
    Student George = new Student(grades, "George");
    Student Kevin = new Student(grades, "Kevin");
    Student Matilda = new Student(grades, "Matilda");
    Student Tom = new Student(grades, "Tom");

    List<Student> studentList = Arrays.asList(James, Evans, Quil, Joy, Ben, Samantha, Mercy, Eric, George, Kevin, Matilda, Tom);



    @Test
    void getRegister() {
        grades.addAll(score);
        names.addAll(namesList);
        students.addAll(studentList);
        Register university = new Register(students);
        assertEquals(names, university.getRegister());
    }
}
package com.company;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    List<Double> score = Arrays.asList(7.5, 5.6,8.2,8.1,4.5,7.6,1.6,8.6);
    List<String> namesList = Arrays.asList("James", "Evans", "Quil", "Joy", "Ben", "Samantha", "Mercy", "Eric", "George", "Kevin", "Matilda", "Tom");
    List<String> namesListLevel300 = Arrays.asList("Quil", "Kevin", "Matilda");


    ArrayList<Double> grades = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> namesLevel300 = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

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
    List<Student> studentList300 = Arrays.asList(Quil, Kevin, Matilda);

    Map<Level, List<Student>> nameListLevelby300 = new HashMap<>();


    @Test
    void getRegister() {
        grades.addAll(score);
        names.addAll(namesList);
        students.addAll(studentList);
        Register university = new Register(students);
        assertEquals(names, university.getRegister());
    }

    @Test
    void getRegisterLevel() {
        grades.addAll(score);
        names.addAll(namesList);
        namesLevel300.addAll(namesListLevel300);
        students.addAll(studentList);
        nameListLevelby300.put(Level.LEVEL300, studentList300);
        Register university = new Register(students);
        assertEquals(nameListLevelby300, university.getRegisterByLevel(Level.LEVEL300));
    }

    @Test
    void printReport() {
        grades.addAll(score);
        names.addAll(namesList);
        namesLevel300.addAll(namesListLevel300);
        students.addAll(studentList);
        Register university = new Register(students);
        System.out.println(university.printReport());
    }

    @Test
    void sort() {
        grades.addAll(score);
        names.addAll(namesList);
        students.addAll(studentList);
        Register university = new Register(students);
        sortByName name = new sortByName();
        university.sort(name);
        ArrayList reg = university.getRegister();
        System.out.println(reg.toString());
    }
}
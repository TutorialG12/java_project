package com.company;

import java.util.ArrayList;

public class BagOfStudents {
    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents (){
        return students;
    }

    public void add(Student student){
        this.students.add(student);
    }
    public void remove(Student student){
        this.students.remove(student);
    }

    public void clear(){
        this.students.clear();
    }
}

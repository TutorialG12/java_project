package com.company;

import java.util.Comparator;

public class sortByName implements Comparator<Student> {
    public int compare(Student student1, Student student2){
        return student1.getname().compareTo(student2.getname());
    }
}

package com.company;

import java.util.Comparator;

public class NameOrderbyLevel implements Comparator<Student> {
    public int compare(Student student1, Student student2){
        return student1.getLevel().compareTo(student2.getLevel());
    }
}

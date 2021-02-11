package com.company;

import java.util.Comparator;

public class sortByAvgGrade implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        if (student1.getAverageGrade() < student2.getAverageGrade()) return -1;
        if (student1.getAverageGrade() > student2.getAverageGrade()) return 1;
        return 0;
    }
}

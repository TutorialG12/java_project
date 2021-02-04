package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {
    ArrayList<Double> grade1 = new ArrayList<Double>();
    ArrayList<Double> grade = new ArrayList<Double>();
    Student david = new Student(grade);
    Student nunana = new Student(grade1);
    Lecture physics = new Lecture();
    Double davidavg = (7.0+5.8+4.5+4.8+7.8)/5;
    Double nunanavg = (4.0+1.2+5.6+7.8+9.5)/5;
    @Test
    void enter() {
        grade.add(7.0);
        grade.add(5.8);
        grade.add(4.5);
        grade.add(4.8);
        grade.add(7.8);

        grade1.add(4.0);
        grade1.add(1.2);
        grade1.add(5.6);
        grade1.add(7.8);
        grade1.add(9.5);

        physics.enter(david);
        physics.enter(nunana);

        Double HighestAvg;

        if(nunanavg > davidavg)
            HighestAvg = nunanavg;
        else
            HighestAvg = davidavg;

        assertEquals(HighestAvg,physics.getHighestAverageGrade());
    }
}
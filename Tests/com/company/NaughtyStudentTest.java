package com.company;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {
    ArrayList<Double> grades = new ArrayList<Double>();
    ArrayList<Double> gradesIncreased = new ArrayList<>();
    NaughtyStudent Nunana = new NaughtyStudent(grades);


    @Test
    void increaseGrades() {
        grades.add(7.0);
        grades.add(5.8);
        grades.add(4.5);
        grades.add(4.8);
        grades.add(7.8);

        for(Double i : grades){
            i+= (i*0.1);
            gradesIncreased.add(i);
        }
        Nunana.increaseGrades();
        assertEquals(gradesIncreased, Nunana.grades);

    }
    @Test
    void kindOf(){
        assertTrue(Nunana instanceof Student);
    }
}
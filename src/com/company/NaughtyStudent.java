package com.company;

import java.util.ArrayList;


public class NaughtyStudent extends Student {

    protected ArrayList<Double> alteredGrade = new ArrayList<>();
    public NaughtyStudent(ArrayList<Double> grades){
        super(grades);
    }
    final void increaseGrades(){
        for(Double grade : this.grades){
            this.alteredGrade.add(grade + (grade * 0.1));
        }
        this.grades = this.alteredGrade;
    }
}

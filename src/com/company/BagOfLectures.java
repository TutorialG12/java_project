package com.company;

import java.util.ArrayList;

public class BagOfLectures {
    ArrayList<Lecture> lecture = new ArrayList<>();

    public void add(Lecture lecture){
        this.lecture.add(lecture);
    }
    public void remove(Lecture lecture){
        this.lecture.remove(lecture);
    }

    public void clear(){
        this.lecture.clear();
    }
}

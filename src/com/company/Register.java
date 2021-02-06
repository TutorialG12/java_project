package com.company;

import java.util.*;

public class Register {

    ArrayList<Student> studentRegister = new ArrayList<>();

    public Register(ArrayList<Student> students){
        this.studentRegister = students;
    }

    public Map<Level, List<Student>> getRegisterByLevel(Level level){
        Map<Level, List<Student>> studentGroup = new HashMap<>();
        ArrayList<Student> studentNames = new ArrayList<>();
        for(Student aStudent : studentRegister){
            if(aStudent.getLevel() == level){
                studentNames.add(aStudent);
            }
        }
        studentGroup.put(level, studentNames);
        return studentGroup;
    }

    public ArrayList<String> getRegister(){
        ArrayList<String> studentNames = new ArrayList<>();
        for(Student people : studentRegister){
            studentNames.add(people.getname());
        }
        return studentNames;
    }



    public String printReport (){
        ArrayList<Student> studentRegisterbyLevel  = new ArrayList<>();
        for(Nameable person : studentRegister){
            Student aStudent  = (Student) person;
            studentRegisterbyLevel.add(aStudent);
        }

        Collections.sort(studentRegisterbyLevel, new NameOrderbyLevel());
        String stringRep = "Student Name  >>>>>>>>>>>  Level\n";
        for(Student astudent : studentRegisterbyLevel){
            stringRep = stringRep + astudent.getname() + "  >>>>>>>>>>>>  " + astudent.getLevel() + "\n";
        }
        return stringRep;
    }
}

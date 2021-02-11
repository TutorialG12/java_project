package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Register {

    ArrayList<Student> studentRegister = new ArrayList<>();

    public Register(ArrayList<Student> students){
        this.studentRegister = students;
    }



    public Map<Level, List<Student>> getRegisterByLevel(Level level){
        Map<Level, List<Student>> studentGroup = new HashMap<>();
        List<Student> studentNames = new ArrayList<>();

        studentNames = studentRegister.stream().filter(student -> student.getLevel() == level).collect(Collectors.toList());

//        for(Student aStudent : studentRegister){
//            if(aStudent.getLevel() == level){
//                studentNames.add(aStudent);
//            }
//        }

        studentGroup.put(level, studentNames);
        return studentGroup;
    }

    public List<String> getRegister(){
        List<String> studentNames = new ArrayList<>();
        studentNames = studentRegister.stream().map(student -> student.getname()).collect(Collectors.toList());
//        for(Student people : studentRegister){
//            studentNames.add(people.getname());
//        }
        return studentNames;
    }

    public String printReport (){
        List<Student> studentRegisterbyLevel  = new ArrayList<>();

        studentRegisterbyLevel = studentRegister.stream().map((Nameable person) -> (Student) person).collect(Collectors.toList());

//        for(Nameable person : studentRegister){
//            Student aStudent  = (Student) person;
//            studentRegisterbyLevel.add(aStudent);
//        }

        Collections.sort(studentRegisterbyLevel, new NameOrderbyLevel());
        String stringRep = "Student Name  >>>>>>>>>>>  Level\n";

        // demonstration of forEach method
        //number.stream().map(x->x*x).forEach(y->System.out.println(y));

        String stringRep2 = studentRegisterbyLevel.stream().map( aStudent -> aStudent.getname() + "  >>>>>>>>>>>>  " + aStudent.getLevel() + "\n" ).collect(Collectors.joining());

//        for(Student astudent : studentRegisterbyLevel){
//            stringRep = stringRep + astudent.getname() + "  >>>>>>>>>>>>  " + astudent.getLevel() + "\n";
//        }
        return stringRep + stringRep2;
    }

    public Double highestGrade() {
        return studentRegister.stream().map(student -> student.studentGrades().max())
                .map(OptionalDouble::getAsDouble).max(Comparator.naturalOrder()).get();
    }

    public Double averageOfAllStudentsGrades() {
         return studentRegister.stream().mapToDouble( student -> student.getAverageGrade()).average().orElse(-1);
    }

    public void getStudentsScoringAbove60() {
       studentRegister.stream().map( student -> student.studentGrades().filter( grade -> grade > 6.0 )).
               forEach(grade -> System.out.println(grade));
    }

    public void checkStudent(String student_name) throws StudentNotFoundException {
            List<Student> foundStudentName = new ArrayList<>();
            foundStudentName = studentRegister.stream().filter(student -> (student.getname() == student_name)).collect(Collectors.toList());
            if(!(foundStudentName.size() > 0)) {
                throw new StudentNotFoundException("Student not found exception");
            }
    }

    public void sort(Comparator<Student> sortby){
        Collections.sort(studentRegister, sortby);
    }
}

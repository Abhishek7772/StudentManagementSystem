package com.student.management;

import java.util.ArrayList;

public class StudentService {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added Successfully!");
    }

    public void viewStudents(){
        if (students.isEmpty()){
            System.out.println("NO Student FOUND.");
            return;
        }
        for (Student s : students){
            System.out.println(s);
        }
    }

    public void searchStudent(int id){
        for (Student s : students){
            if (s.getId() == id){
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student NOT FOUND");
    }

    public void deleteStudent(int id){
        for (Student s : students){
            if (s.getId() == id){
                students.remove(s);
                System.out.println("Student DELETED.");
                return;
            }

        }
        System.out.println("Student NOT FOUND.");
    }
}

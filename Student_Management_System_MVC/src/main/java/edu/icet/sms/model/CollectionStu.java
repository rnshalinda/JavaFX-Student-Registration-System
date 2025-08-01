package edu.icet.sms.model;

import java.util.ArrayList;

public class CollectionStu {

    private static ArrayList<Student> students = new ArrayList<>();;

    public static void addStudent(Student student){
        students.add(student);
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }
}

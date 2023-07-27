package com.learning.collections.miscelleneous;

import java.util.HashSet;
import java.util.Set;

public class StudentDetails {

    public static void main(String args[]) {
        Set<Student> student = new HashSet<>();
        student.add(new Student(1,"Anuj", 34));
        student.add(new Student(4,"Kavya", 24));
        student.add(new Student(4,"Kavya", 24));
        System.out.println(student);

        Student s1 = new Student(43,"Priya", 22);
        Student s2 = new Student(56, "Dipika",20);

        System.out.println(s1.equals(s2));
    }
}

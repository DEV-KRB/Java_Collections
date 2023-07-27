package com.learning.collections.miscelleneous;

import java.util.Objects;

public class Student {

    public int rno;
    public String name;
    public int age;

    public Student(int rno, String name, int age) {
        this.rno = rno;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rno == student.rno;
    }
    @Override
    public int hashCode() {
        return Objects.hash(rno);
    }
}

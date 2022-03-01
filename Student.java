//package ru.netology;

import java.util.Objects;

public class Student {

    private final String name;
    private final String group;
    private final String studentId;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "  - " + name +
                ", " + group + ", " + studentId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(Student.class)) {
            return false;
        }
        System.out.println("Студент с таким номером студенческого билета уже существует");
        Student student = (Student) obj;
        return studentId.equals(student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}




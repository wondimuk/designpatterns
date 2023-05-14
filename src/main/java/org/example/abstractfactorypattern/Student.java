package org.example.abstractfactorypattern;

public abstract class Student {
    private String name;
    private Student schoolGrade;

    public Student(String name) {
        this.name = name;
    }
}

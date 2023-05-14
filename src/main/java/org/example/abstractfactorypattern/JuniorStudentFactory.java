package org.example.abstractfactorypattern;

public class JuniorStudentFactory implements StudentFactory{

    @Override
    public Student createStudent(String name) {
        System.out.println("Junior student created");
        return new JuniorStudent(name);
    }
}

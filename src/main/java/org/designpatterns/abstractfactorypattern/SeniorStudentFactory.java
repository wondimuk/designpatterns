package org.designpatterns.abstractfactorypattern;

public class SeniorStudentFactory implements StudentFactory{

    @Override
    public Student createStudent(String name) {
        System.out.println("Senior student created!");
        return new SeniorStudent(name);
    }

}

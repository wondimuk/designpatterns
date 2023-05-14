package org.example.abstractfactorypattern;

public class Tester {
    public static void main(String[] args) {

        StudentFactory st = new SeniorStudentFactory();
        st.createStudent("AB");

        StudentFactory jt = new JuniorStudentFactory();
        jt.createStudent("ABC");

    }
}

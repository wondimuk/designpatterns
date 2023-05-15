package org.example.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClientTester {
    public static void main(String[] args) {



        Employee.Address address = new Employee.Address("0003 lands end circle", "","OH", "0000");
        Employee.Address address1 = new Employee.Address("0001 lands end circle", "","OH", "0000");
        Employee.Address address2 = new Employee.Address("0002 lands end circle", "","OH", "0000");

        Employee emp1 = new Employee("Sena Kayo", address);
        Employee emp2 = new Employee("Michael Oromo", address1);
        Employee emp3 = new Employee("Oromo Kenea", address2);

        List<Employee> lst = new ArrayList<>(Arrays.asList(emp1,emp2,emp3));

        lst.forEach(a->System.out.println("Before sort " + a));

        Collections.sort(lst, new EmployeeComparator());

        lst.forEach(a->System.out.println("After sort " + a));
    }
}

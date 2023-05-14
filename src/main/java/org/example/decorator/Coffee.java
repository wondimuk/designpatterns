package org.example.decorator;

import java.util.ListIterator;

public class Coffee extends Beverage {
    @Override
    double cost() {
        return 6.5;
    }
}

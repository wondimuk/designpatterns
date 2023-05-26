package org.designpatterns.decorator;

import org.designpatterns.decorator.Beverage;

public class Coffee extends Beverage {
    @Override
    double cost() {
        return 6.5;
    }
}

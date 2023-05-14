package org.example.decorator;

public class MochaDecorator implements CondimentDecorator {

    private Beverage beverage;

    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return 3.5;
    }
}

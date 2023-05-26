package org.designpatterns.decorator;

public class MilkDecorator implements CondimentDecorator {

    private Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return 2.5 + beverage.cost();
    }
}

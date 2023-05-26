package org.designpatterns.decorator;

public class Client {

    public static void main(String[] args) {
        Beverage bv = new Coffee();
        bv.cost();
        CondimentDecorator decorator = new MilkDecorator(bv);
        System.out.println("Decorated object calculated cost=" + decorator.cost());
    }
}

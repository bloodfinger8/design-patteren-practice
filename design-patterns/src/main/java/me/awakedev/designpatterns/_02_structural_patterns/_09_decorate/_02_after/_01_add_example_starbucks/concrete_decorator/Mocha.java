package me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.concrete_decorator;

import me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.componet.Beverage;
import me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    public int cost() {
        return beverage.cost() + 500;
    }
}

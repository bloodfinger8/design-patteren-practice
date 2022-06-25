package me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.decorator;


import me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.componet.Beverage;

public abstract class CondimentDecorator extends Beverage {
    private Beverage beverage;

    @Override
    public int cost() {
        return beverage.cost();
    }
}

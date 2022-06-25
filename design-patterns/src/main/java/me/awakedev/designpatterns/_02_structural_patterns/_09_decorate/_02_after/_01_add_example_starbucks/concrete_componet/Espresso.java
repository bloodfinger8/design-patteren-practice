package me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.concrete_componet;

import me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.componet.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public int cost() {
        return 3000;
    }
}

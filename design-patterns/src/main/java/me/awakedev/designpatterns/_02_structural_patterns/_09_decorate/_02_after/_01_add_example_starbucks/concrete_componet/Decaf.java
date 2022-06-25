package me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.concrete_componet;

import me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.componet.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "디카페인";
    }

    @Override
    public int cost() {
        return 4100;
    }
}

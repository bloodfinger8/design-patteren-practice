package me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.concrete_componet;

import me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.componet.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "하우스블렌딩";
    }

    @Override
    public int cost() {
        return 4900;
    }
}

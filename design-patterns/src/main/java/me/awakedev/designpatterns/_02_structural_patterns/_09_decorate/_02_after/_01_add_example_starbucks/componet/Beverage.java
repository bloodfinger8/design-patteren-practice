package me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.componet;

public abstract class Beverage {
    public String description = "음료";

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}

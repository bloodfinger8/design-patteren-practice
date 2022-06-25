package me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks;

import me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.componet.Beverage;
import me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.concrete_componet.Espresso;
import me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.concrete_componet.HouseBlend;
import me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.concrete_decorator.Mocha;
import me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after._01_add_example_starbucks.concrete_decorator.OneShot;

public class Main {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());


        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new OneShot(beverage1);
        System.out.println(beverage1.getDescription());
        System.out.println(beverage1.cost());

    }
}

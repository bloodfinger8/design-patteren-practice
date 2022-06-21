package me.awakedev.designpatterns._02_structural_patterns._07_bridge._02_after;

import me.awakedev.designpatterns._02_structural_patterns._07_bridge._01_before.Pizza;

public class App {
    public static void main(String[] args) {
        Pizza dominoPepperoni = new PepperoniPizza(new Domino());
        dominoPepperoni.pay();
        dominoPepperoni.add();

        Pizza mrPepperoni = new PepperoniPizza(new Mr());
        mrPepperoni.pay();
        mrPepperoni.add();
    }
}

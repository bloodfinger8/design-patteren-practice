package me.awakedev.designpatterns._02_structural_patterns._07_bridge._01_before;

public class App {
    public static void main(String[] args) {
        Pizza pizza = new DominoPizzaPotato();
        pizza.add();
        pizza.pay();
    }
}

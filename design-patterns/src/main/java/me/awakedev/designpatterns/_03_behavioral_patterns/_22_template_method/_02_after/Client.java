package me.awakedev.designpatterns._03_behavioral_patterns._22_template_method._02_after;

public class Client {
    public static void main(String[] args) {
        CaffeineBeverage beverage = new Coffee();
        beverage.prepareRecipe();
    }
}

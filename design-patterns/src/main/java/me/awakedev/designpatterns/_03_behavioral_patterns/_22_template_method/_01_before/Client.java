package me.awakedev.designpatterns._03_behavioral_patterns._22_template_method._01_before;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}

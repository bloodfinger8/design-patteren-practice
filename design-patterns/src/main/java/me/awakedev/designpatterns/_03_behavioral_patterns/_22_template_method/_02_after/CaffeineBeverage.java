package me.awakedev.designpatterns._03_behavioral_patterns._22_template_method._02_after;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiment();
    }

    abstract void brew();

    abstract void addCondiment();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}

package me.awakedev.designpatterns._03_behavioral_patterns._22_template_method._01_before;

public class Coffee {

    final void prepareRecipe(){
        boilWater();
        brewCoffee();
        pourInCup();
        addSugar();
    }

    public void addSugar() {
        System.out.println("설탕 추가 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    public void brewCoffee() {
        System.out.println("커피 우려내는 중");
    }

    public void boilWater() {
        System.out.println("물 끓이는 중");
    }
}

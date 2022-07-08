package me.awakedev.designpatterns._03_behavioral_patterns._22_template_method._01_before;

public class Tea {

    final void prepareRecipe(){
        boilWater();
        brewTea();
        pourInCup();
        addLemon();
    }

    public void addLemon() {
        System.out.println("레몬 첨가 중");
    }

    public void brewTea() {
        System.out.println("티 우려내는 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    public void boilWater() {
        System.out.println("물 끓이는 중");
    }
}

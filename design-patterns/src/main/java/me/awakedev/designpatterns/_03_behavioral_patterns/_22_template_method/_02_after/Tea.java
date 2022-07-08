package me.awakedev.designpatterns._03_behavioral_patterns._22_template_method._02_after;

public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("찻잎을 우려내는 중");
    }

    @Override
    void addCondiment() {
        System.out.println("레몬을 추가하는중");
    }
}

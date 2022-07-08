package me.awakedev.designpatterns._03_behavioral_patterns._22_template_method._02_after;

public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("커피콩을 우려내는 중");
    }

    @Override
    void addCondiment() {
        System.out.println("시럽을 첨가하는 중");
    }
}

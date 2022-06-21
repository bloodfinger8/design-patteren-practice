package me.awakedev.designpatterns._02_structural_patterns._07_bridge._02_after;

import me.awakedev.designpatterns._02_structural_patterns._07_bridge._01_before.Pizza;

public class DefaultPizza implements Pizza {

    private Company company;
    private String pizzaType;

    public DefaultPizza(Company company, String pizzaType) {
        this.company = company;
        this.pizzaType = pizzaType;
    }

    @Override
    public void pay() {
        System.out.println(company.getName() +  "/" + pizzaType + " - 지불 ");
    }

    @Override
    public void add() {
        System.out.println(company.getName() +  "/" + pizzaType + " - 추가 ");
    }

    @Override
    public void bonus() {
        System.out.println(company.getName() +  "/" + pizzaType + " - 보너스 ");
    }
}

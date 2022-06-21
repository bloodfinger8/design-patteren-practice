package me.awakedev.designpatterns._02_structural_patterns._07_bridge._01_before;

public class MrPizzaPotato implements Pizza{

    @Override
    public void pay() {
        System.out.println("미스터 피자 /포테이토  : 지불");
    }

    @Override
    public void add() {
        System.out.println("미스터 피자 /포테이토  : 추가");
    }

    @Override
    public void bonus() {
        System.out.println("미스터 피자 /포테이토  : 보너스");
    }
}

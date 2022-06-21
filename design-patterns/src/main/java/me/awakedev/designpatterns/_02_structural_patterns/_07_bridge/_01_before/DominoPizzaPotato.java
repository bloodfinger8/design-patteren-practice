package me.awakedev.designpatterns._02_structural_patterns._07_bridge._01_before;

public class DominoPizzaPotato implements Pizza{
    @Override
    public void pay() {
        System.out.println("도미노 포테이토피자 : 지불");
    }

    @Override
    public void add() {
        System.out.println("도미노 포테이토피자 : 추가");
    }

    @Override
    public void bonus() {
        System.out.println("도미노 포테이토피자 : 보너스");
    }
}

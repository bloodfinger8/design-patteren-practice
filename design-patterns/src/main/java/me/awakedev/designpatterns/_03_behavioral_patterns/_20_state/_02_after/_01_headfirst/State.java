package me.awakedev.designpatterns._03_behavioral_patterns._20_state._02_after._01_headfirst;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}

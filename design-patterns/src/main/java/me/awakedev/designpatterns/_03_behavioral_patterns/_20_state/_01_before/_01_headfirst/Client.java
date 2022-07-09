package me.awakedev.designpatterns._03_behavioral_patterns._20_state._01_before._01_headfirst;

public class Client {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5);

        System.out.println(machine);

        machine.insertQuarter();
        machine.turnCrank();

        System.out.println(machine);

        machine.insertQuarter();
        machine.ejectQuarter();
        machine.turnCrank();

        System.out.println(machine);

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        machine.ejectQuarter();

        System.out.println(machine);

        machine.insertQuarter();
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println(machine);
    }
}

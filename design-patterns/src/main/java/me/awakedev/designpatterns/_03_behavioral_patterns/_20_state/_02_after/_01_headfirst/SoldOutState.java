package me.awakedev.designpatterns._03_behavioral_patterns._20_state._02_after._01_headfirst;

public class SoldOutState  implements State{
    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("알맹이를 내보내고 있습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑으셨습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이는 한 번만 돌려 주세요.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();;

        if(gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            System.out.println("오우 동전이 없어요~");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}

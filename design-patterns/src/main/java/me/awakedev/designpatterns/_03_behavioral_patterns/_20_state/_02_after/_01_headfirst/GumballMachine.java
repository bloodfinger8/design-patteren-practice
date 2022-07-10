package me.awakedev.designpatterns._03_behavioral_patterns._20_state._02_after._01_headfirst;

public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State state;
    private int count = 0;

    public GumballMachine(int numberGumballs) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);

        this.count = numberGumballs;
        this.state = numberGumballs > 0 ? noQuarterState : soldState;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    public void turnCrank() {
        state.turnCrank();
    }
    void setState(State state) {
        this.state = state;
    }

    void releaseBall(){
        System.out.println("알맹이를 내보내고 있습니다.");
        if(count > 0 ) {
            count = count -1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }
}

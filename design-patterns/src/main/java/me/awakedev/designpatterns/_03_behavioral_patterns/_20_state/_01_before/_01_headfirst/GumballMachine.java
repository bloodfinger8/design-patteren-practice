package me.awakedev.designpatterns._03_behavioral_patterns._20_state._01_before._01_headfirst;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if(count > 0) {
            state = NO_QUARTER;
        }
    }

    //동전 투입
    public void insertQuarter(){
        if(this.state == HAS_QUARTER) {
            System.out.println("동전은 한 개만 넣어주세요.");
        }else if(state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 넣으셨습니다.");
        }else if(state == SOLD_OUT) {
            System.out.println("매진되었습니다. 다음 기회에 이용해 주세요");
        }else if(state == SOLD) {
            System.out.println("알맹이를 보내고 있습니다");
        }
    }

    //
    public void ejectQuarter(){
        if(this.state == HAS_QUARTER) {
            System.out.println("동전이 반환됩니다.");
            state = NO_QUARTER;
        }else if(state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요");
        }else if(state == SOLD) {
            System.out.println("이미 알맹이를 뽑으셨습니다.");
        }else if(state == SOLD_OUT) {
            System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
        }
    }

    //손잡이 돌리기
    public void turnCrank(){
        if(this.state == SOLD) {
            System.out.println("손잡이를 한번만 돌려주세요.");
        }else if(state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        }else if(state == SOLD_OUT) {
            System.out.println("매진되었습니다.");
        }else if(state == HAS_QUARTER) {
            System.out.println("손잡이를 돌리셨습니다.");
            state = SOLD;
            dispense();
        }
    }

    //알맹이 내보내기
    public void dispense(){
        if(this.state == SOLD) {
            System.out.println("알맹이를 내보내고 있습니다.");
            count = count -1;
            if(count == 0) {
                System.out.println("더 이상 알맹이가 없습니다.");
                state = SOLD_OUT;
            }else  {
                state = NO_QUARTER;
            }
        }else if(state == NO_QUARTER) {
            System.out.println("동전을 넣어 주세요");
        }else if(state == SOLD_OUT) {
            System.out.println("매진입니다.");
        }else if(state == HAS_QUARTER) {
            System.out.println("알맹이를 내보낼 수 없습니다.");
        }
    }
}

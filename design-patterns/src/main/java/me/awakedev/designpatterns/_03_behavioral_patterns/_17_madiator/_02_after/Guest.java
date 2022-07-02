package me.awakedev.designpatterns._03_behavioral_patterns._17_madiator._02_after;

import java.time.LocalDateTime;

public class Guest {
    private Integer id;
    private FrontDesk frontDesk = new FrontDesk();

    public void getTowers(int numberOfTowers) {
        this.frontDesk.getTowers(this, numberOfTowers);
    }

    private void dinner(LocalDateTime dateTime) {
        this.frontDesk.dinner(this, dateTime);
    }

    public Integer getId() {
        return id;
    }
}

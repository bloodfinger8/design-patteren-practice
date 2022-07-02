package me.awakedev.designpatterns._03_behavioral_patterns._17_madiator._02_after;

import java.time.LocalDateTime;

public class Restaurant {
    public void dinner(Integer id, LocalDateTime dateTime) {
        System.out.println(id +"/" + dateTime + " 손님의 음식이 예약되었습니다.");
    }
}

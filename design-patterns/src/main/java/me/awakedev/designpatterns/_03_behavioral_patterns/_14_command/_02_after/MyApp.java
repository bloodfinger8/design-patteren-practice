package me.awakedev.designpatterns._03_behavioral_patterns._14_command._02_after;

import lombok.AllArgsConstructor;
import me.awakedev.designpatterns._03_behavioral_patterns._14_command._01_before.Game;

@AllArgsConstructor
public class MyApp {
    private Command command;

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp(new GameStartCommand(new Game()));
        myApp.press();
    }
}

package me.awakedev.designpatterns._03_behavioral_patterns._14_command._02_after;

import me.awakedev.designpatterns._03_behavioral_patterns._14_command._01_before.Game;

import java.util.Stack;

public class Button {
    private Stack<Command> commands = new Stack<>();

    private void press(Command command) {
        command.execute();
        this.commands.push(command);
    }

    private void undo() {
        if (!commands.isEmpty()) {
            Command command = commands.pop();
            command.undo();
        }
    }
    
    public static void main(String[] args) {
        Button button = new Button();
        button.press(new GameStartCommand(new Game()));
        button.undo();
    }
}

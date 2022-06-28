package me.awakedev.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._02_after;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class RequestHandler {
    private RequestHandler nextHandler;

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}

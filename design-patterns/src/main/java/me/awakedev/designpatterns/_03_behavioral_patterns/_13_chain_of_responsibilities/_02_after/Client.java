package me.awakedev.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._02_after;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Client {
    private RequestHandler requestHandler;

    private void doWork() {
        requestHandler.handle(new Request("hi"));
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }

}

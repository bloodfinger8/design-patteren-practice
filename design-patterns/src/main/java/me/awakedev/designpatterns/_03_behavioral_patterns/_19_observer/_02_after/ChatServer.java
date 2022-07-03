package me.awakedev.designpatterns._03_behavioral_patterns._19_observer._02_after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {
    private Map<String , List<Subscriber>> subscribers = new HashMap<>();

    public void register(String subject, Subscriber user) {
        if (this.subscribers.containsKey(subject)) {
            this.subscribers.get(subject).add(user);
        }else{
            List<Subscriber> list = new ArrayList<>();
            list.add(user);
            this.subscribers.put(subject, list);
        }

    }

    public void sendMessage(User user, String subject, String message) {
        if (this.subscribers.containsKey(subject)) {
            String userMessage = user.getName() + ": " + message;
            this.subscribers.get(subject).forEach(s -> s.handleMessage(userMessage));
        }
    }

    public void unregister(String subject, Subscriber user) {
        if (this.subscribers.containsKey(subject)) {
            this.subscribers.get(subject).remove(user);
        }
    }
}

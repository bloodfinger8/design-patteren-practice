package me.awakedev.designpatterns._02_structural_patterns._08_composite._02_after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component{

    private List<Component> list = new ArrayList<>();

    public void add(Component component) {
        list.add(component);
    }

    public List<Component> get() {
        return list;
    }

    @Override
    public int getPrice() {
        return list.stream().mapToInt(Component::getPrice).sum();
    }
}

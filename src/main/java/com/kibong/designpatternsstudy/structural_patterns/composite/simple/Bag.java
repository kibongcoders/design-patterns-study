package com.kibong.designpatternsstudy.structural_patterns.composite.simple;

import com.kibong.designpatternsstudy.structural_patterns.composite.before.Item;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component{

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getItems() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}

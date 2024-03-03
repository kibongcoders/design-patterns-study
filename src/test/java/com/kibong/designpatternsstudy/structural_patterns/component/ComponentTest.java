package com.kibong.designpatternsstudy.structural_patterns.component;

import com.kibong.designpatternsstudy.structural_patterns.composite.simple.Bag;
import com.kibong.designpatternsstudy.structural_patterns.composite.simple.Component;
import com.kibong.designpatternsstudy.structural_patterns.composite.simple.Item;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ComponentTest {

    @Test
    public void componentTest() {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        printPrice(doranBlade);
        printPrice(bag);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}

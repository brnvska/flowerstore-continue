package ua.edu.ucu.apps.demo.delivery;

import ua.edu.ucu.apps.demo.item.Item;

import java.util.LinkedList;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class PostDeliveryStrategy implements Delivery {
    private String name;
    private String description;

    public PostDeliveryStrategy() {
        name = "Post Delivery";
        description = "Post Delivery Strategy";
    }

    @Override
    public void deliver(LinkedList<Item> items) {
        LinkedList<Item> toDelete;
        toDelete = items;
        items.removeAll(toDelete);
        System.out.println("Items are delivered by Post");
    }
}
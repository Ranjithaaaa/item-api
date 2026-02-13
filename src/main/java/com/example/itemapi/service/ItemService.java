package com.example.itemapi.service;

import jakarta.annotation.PostConstruct;

import com.example.itemapi.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private Long nextId = 1L;

    public Item addItem(Item item) {
        item.setId(nextId++);
        items.add(item);
        return item;
    }

    public Optional<Item> getItem(Long id) {
        return items.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst();
    }

    public List<Item> getAllItems() {
        return items;
    }

    @PostConstruct
public void init() {
    items.add(new Item(1, "Laptop", 50000));
    items.add(new Item(2, "Phone", 20000));
}

}


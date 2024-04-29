package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class SubCategory {
    private String name;
    private List<String> items;

    public SubCategory(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addItem(String item) {
        items.add(item);
    }
}
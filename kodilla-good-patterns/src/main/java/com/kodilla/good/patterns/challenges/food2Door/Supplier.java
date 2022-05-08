package com.kodilla.good.patterns.challenges.food2Door;

import java.util.ArrayDeque;
import java.util.Deque;

public class Supplier {
    String name;
    String adress;

    Deque<Supply> suppliesHistory= new ArrayDeque<>();

    public Supplier(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }
}

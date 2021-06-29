package com.fju;

public class Milk extends Drink {
    public Milk() {
        name = "e)Milk";
        price = 15;
    }
    @Override
    public String getName() {
        return "e)Milk";
    }

    @Override
    public int getPrice() {
        return 15;
    }
}

package com.fju;

public class Coffee extends Drink {
    public Coffee() {
        name = "d)Coffee";
        price = 20;
    }
    @Override
    public String getName() {
        return "d)Coffee";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}

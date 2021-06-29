package com.fju;

public class Water extends Drink {
    public Water() {
        name = "c)Water";
        price = 10;
    }
    @Override
    public String getName() {
        return "c)Water";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}

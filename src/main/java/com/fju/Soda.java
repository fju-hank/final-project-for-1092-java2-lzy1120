package com.fju;

public class Soda extends Drink {
    public Soda() {
        name = "b)Soda";
        price = 25;
    }
    @Override
    public String getName() {
        return "b)Soda";
    }

    @Override
    public int getPrice() {
        return 25;
    }
}

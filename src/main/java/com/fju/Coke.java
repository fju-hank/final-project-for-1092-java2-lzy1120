package com.fju;

public class Coke extends Drink {
    public Coke() {
        name = "a)Coke";
        price = 30;
    }
    @Override
    public String getName() {
        return "a)Coke";
    }

    @Override
    public int getPrice() {
        return 30;
    }
}

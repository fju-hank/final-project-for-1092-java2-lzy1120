package com.fju;

public abstract class Drink {
    String name;
    int price;

    public boolean validate(int a) {
        return (a>=price);
    }

    public abstract String getName();

    public abstract int getPrice();
}

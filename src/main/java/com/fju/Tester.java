package com.fju;


import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("a)Coke $30");
        System.out.println("b)Soda $25");
        System.out.println("c)Water $10");
        System.out.println("d)Coffee $20");
        System.out.println("e)Milk $15");
        int sum = 0, remaining = 0;
        int a = 30, b = 25, c = 10, d = 20, e = 15;
        int ten = 0, five = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Please insert coin or choose: ");
            String insert = scanner.next();
            if (insert.startsWith("a")) {
                if (sum >= a) {
                    sum = sum - a;
                    System.out.println("a)Coke $30, Remaining: " + sum);
                } else {
                    System.out.println("Beep! Total: " + sum);
                }
            } else if(insert.startsWith("b")) {
                if (sum >= b) {
                    sum = sum -b;
                    System.out.println("b)Soda $25, Remaining: " + sum);
                } else {
                    System.out.println("Beep! Total: " + sum);
                }
            } else if (insert.startsWith("c")) {
                if(sum >= c) {
                    sum = sum -c;
                    System.out.println("c)Water $10, Remaining: " + sum);
                } else {
                    System.out.println("Beep! Total: " + sum);
                }
            } else if (insert.startsWith("d")) {
                if (sum >= d) {
                    sum = sum -d;
                    System.out.println("d)Coffee $20, Remaining: " + sum);
                } else {
                    System.out.println("Beep! Total: " + sum);
                }
            } else if (insert.startsWith("e")) {
                if (sum >= e) {
                    sum = sum-e;
                    System.out.println("e)Milk $15, Remaining: " + sum);
                } else {
                    System.out.println("Beep! Total: " + sum);
                }
            } else {
                int insertCoin = Integer.parseInt(insert);
                if (insertCoin == 0) {
                    remaining = sum;
                    if(sum / 10 > 0) {
                        ten = sum / 10;
                        remaining = sum - ten*10;
                    }
                    if (remaining / 5 > 0) {
                        five = remaining / 5;
                        remaining = remaining - five*5;
                    }
                    System.out.println("Returning $10: " + ten);
                    System.out.println("Returning $5: " + five);
                    System.out.println("Returning $1: " + remaining);

                    System.out.println("Bye");
                    break;
                } else {
                    sum = sum + insertCoin;
                    System.out.println("Total: " + sum);
                    continue;
                }
            }
        }
    }
}

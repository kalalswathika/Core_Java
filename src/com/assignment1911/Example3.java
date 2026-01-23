package com.assignment1911;

public class Example3 {
    static int count = 0;
    static void show() {
        count++;
        System.out.println("Count: " + count);
    }
    public static void main(String[] args) {
        show();
        show();
        show();
    }
}

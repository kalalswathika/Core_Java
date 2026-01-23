package com.assignment1911;

public class Example7 {
	static int StaticVar = 0;
    int nonStaticVar = 0;
    public void increment() {
        StaticVar++;
        nonStaticVar++;
        System.out.println("StaticVarible:"+StaticVar);
        System.out.println("NonStaticVarible:"+ nonStaticVar);
    }
    public static void main(String[] args) {
        Example7 E1 = new Example7();
        Example7 E2 = new Example7();
        E1.increment();
        E2.increment();
    }
}

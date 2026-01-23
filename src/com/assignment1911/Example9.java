package com.assignment1911;

public class Example9 {
	static int executionCount = 0;
    static void process() {
        executionCount++;
        System.out.println("Method called " + executionCount + " times");
    }
    public static void main(String[] args) {
        process();
        process();
        process();
    }
}

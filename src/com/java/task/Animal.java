package com.java.task;

class Animal1{
	public void display() {
		System.out.println("This is an animal");
	}
}
class Dog extends Animal1{
}
public class Animal{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}

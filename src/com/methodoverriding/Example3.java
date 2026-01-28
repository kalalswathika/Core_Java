package com.methodoverriding;
class Person{
	protected void display() {
		System.out.println("Iam a Person");
	}
}
class Student extends Person{
	@Override
	
	public void display() {
		System.out.println("Iam a Student");
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student();
		std.display();

	}

}

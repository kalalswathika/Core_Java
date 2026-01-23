package com.java.task;
class Person1{
	Person1(){
		System.out.println("Person object created");
	}
}
class Student extends Person1{

	public Student() {
		super();
		System.out.println("Student object created");
	}
}
public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S=new Student();

	}

}

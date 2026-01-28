package com.methodoverriding;
class Shape{
	public void draw() {
		System.out.println("Drawing Shape");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing Circle");
	}	
}
class Square extends Shape{
	public void draw() {
		System.out.println("Drawing Square");
	}	
}
public class Example5 {
	public static void main(String[] args) {
	Shape s=new Circle();
	s.draw();
	Shape s1=new Square();
	s1.draw();

	}

}

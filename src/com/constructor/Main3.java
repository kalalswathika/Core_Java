package com.constructor;


class Shape{
public Shape() {	
		}
public double   calculateArea() {
return 0;
}
}
class Circle extends Shape{
	double  radius;

	public Circle(double  radius) {
		super();
		this.radius = radius;
	}
	//override
    public double  calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircleArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape{
	int length;
	int breadth;
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public double  calculateArea() {
		return length*breadth;
	}
	public double  calculateRectangleArea() {
		return length*breadth;
	}
}
class Triangle extends Shape{
	int base;
	int height;
     public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
     public double calculateArea() {
    	 return 0.5*base*height;
     }	
     public double calculateTriangleArea() {
    	 return 0.5*base*height;
     }	
}
public class Main3 {
	public static void main(String[] args) {
		Shape circle = new Circle(5.0);
		System.out.println(circle.calculateArea());
		Circle c=(Circle)circle;
		System.out.println(c.calculateCircleArea());
		System.out.println("------------");
		Shape rectangle=new Rectangle(10,20);
		System.out.println(rectangle.calculateArea());
		Rectangle r=(Rectangle) rectangle;
		System.out.println(r.calculateRectangleArea());
		System.out.println("------------");
		Shape triangle=new Triangle(3,9);
		System.out.println(triangle.calculateArea());
	    Triangle t=(Triangle) triangle; 
		System.out.println(t.calculateTriangleArea());
		
	}

}


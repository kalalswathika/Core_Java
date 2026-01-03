package com.inheritance;

public class Y extends X {
	public void method2() {
		System.out.println("This is child class");
	}
	public static void main(String[] args) {
		/*Y y= new Y();
		System.out.println(y.a);
		y.method1();
		y.method2();*/
		/*X x=(X)new Y();*/
		/*x.method1();*/
		/*x.method2();*/
		/*Y y1=(Y) new X();
		System.out.println(y1.a);
		y1.method1();
		y1.method2();*/
		X x=new Y();
		Y y=(Y) x;
		System.out.println(y.a);
		y.method1();
		y.method2();
		
	}

}

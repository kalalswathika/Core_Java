package com.java.task;
class Computerr{
	public void showBrand() {
		System.out.println("Brand: Dell");
	}
}
class Subclass extends Computerr{
	public void showModel() {
		System.out.println("Model: XPS 15");
	}
}
public class Compute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Subclass SC=new Subclass();
     SC.showBrand();
     SC.showModel();
	}

}

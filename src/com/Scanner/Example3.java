package com.Scanner;
import java.util.Scanner;
public class Example3 {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
System.out.println("Enter age:");
int age= scr.nextInt();
System.out.println("Enter Gender:");
String gender=scr.next();
if((age>=21 && gender.equals("Female"))||(age>=27 && gender.equals("Male"))){
	System.out.println("Eligible for Maraige");
	
}else {
	System.out.println("Not Eligible for marrage");
	
}
scr.close();
	}

}

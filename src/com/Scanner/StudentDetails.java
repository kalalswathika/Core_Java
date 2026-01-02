package com.Scanner;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter your name :");
		String StudentName=scr.nextLine();
		System.out.println("Enter your Id :");
		int StudentId=scr.nextInt();
		System.out.println("Enter your course name :");
		String CourseName=scr.next();
		System.out.println("Enter your marks :");
		double totalMarks=scr.nextDouble();
		StudentResult obj=new StudentResult(StudentName,StudentId,CourseName,totalMarks);
        int option=0;
        do {
        	System.out.println("Enter your option:");
        	System.out.println("Enter 1 to add marks");
        	System.out.println("Enter 2 to calculate grade");
        	System.out.println("Enter 3 to See total marks");
        	System.out.println("Enter 4 to exit");
        	option=scr.nextInt();
        	switch(option)
    		{
    		case 1:
    		System.out.println("Enter marks to add:");
    		int marks=scr.nextInt();
    		obj.addMarks(marks);
    		break;
    		
    		case 2:
    		obj.CalGrade(totalMarks);
    		break;
    		 
    		case 3:
    		obj.Marks();
    		break;
    		
    		case 4:
    			obj.exit();
    			break;
    			
    			default:
    				System.out.println("Invalid option");

    	}
    	}while(option!=4);
        scr.close();
        }
        
	}


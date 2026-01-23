package com.constructor;

class Student{
	String name;
	String studentId;
public Student(String name, String studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
	}
public void displayStudentInfo() {
	System.out.println("Name:"+name);
	System.out.println("StudentId:"+studentId);
}
}
class Undergraduate extends Student{
	String major;
	public Undergraduate(String name, String studentId, String major) {
		super(name, studentId);
		this.major = major;
	}
public void displayUndergraduateInfo() {
	System.out.println("Major:"+name);	
}	
}
class Graduate extends Student{
	String theseisTopic;
	public Graduate(String name,String studentId, String theseisTopic) {
		super(name,studentId );
		this.theseisTopic =theseisTopic;
	}
public void displayGraduateInfo() {
	System.out.println("Thes is topic:"+theseisTopic);	
}	
}
class PhdStudent extends Student{
	String researchArea;
	public PhdStudent(String name, String studentId, String researchArea) {
		super(name, studentId);
		this.researchArea =researchArea;
	}
public void displayPhdStudentInfo() {
	System.out.println("ResearchArea:"+researchArea);	
}	
}
public class Main5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student undergraduate = new Undergraduate("Alice", "U12345", "Computer Science");
		undergraduate.displayStudentInfo();
		Undergraduate Ug=(Undergraduate)undergraduate;
		Ug.displayUndergraduateInfo();
		System.out.println("------------");
		Student graduate=new Graduate("Bob", "G67890", "Machine Learning");
		graduate.displayStudentInfo();
		Graduate G=(Graduate) graduate;
		G.displayGraduateInfo();
		System.out.println("-------------");
		Student phdstudent=new PhdStudent("Charlie", "P11223", "Artificial Intelligence");
		phdstudent.displayStudentInfo();
		PhdStudent PHD=(PhdStudent) phdstudent;
		PHD.displayPhdStudentInfo();
	}

}

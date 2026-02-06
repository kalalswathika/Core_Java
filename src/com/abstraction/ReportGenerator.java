package com.abstraction;

public abstract class ReportGenerator {
	String title;
	
	public ReportGenerator(String title) {
		super();
		this.title = title;
	}
	abstract void  generateContent();
	public void openFile() {
		System.out.println("All reports need to open a file");
	}
	public void writeContent() {
		System.out.println("All reports need to write content");
	}
   public void saveFile() {
	   System.out.println("All reports need to save the file");
   }
}

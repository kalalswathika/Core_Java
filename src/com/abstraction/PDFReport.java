package com.abstraction;

public class PDFReport extends ReportGenerator {
	String blockText;

	public PDFReport(String title,String blockText) {
		super(title);
		this.blockText = blockText;
	}
	public void generateContent() {
		System.out.println("Generating PDF content with block text");
	}
	public void openFile() {
		System.out.println("Opening PDF file.");
	}
	public void writeContent() {
		System.out.println("Writing content to PDF file");
	}
   public void saveFile() {
	   System.out.println("Saving PDF file");
   }
}

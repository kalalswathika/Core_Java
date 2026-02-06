package com.abstraction;

public class HTMLReport extends ReportGenerator{
	String markupContent;

	public HTMLReport(String title, String markupContent) {
		super(title);
		this.markupContent = markupContent;
	}
	public void generateContent() {
		System.out.println("Generating HTML content with markup.");
	}
	public void openFile() {
		System.out.println("Opening HTML file.");
	}
	public void writeContent() {
		System.out.println("Writing content to HTML file.");
	}
   public void saveFile() {
	   System.out.println("Saving HTML file.");
   }
}

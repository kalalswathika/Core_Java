package com.abstraction;

public class ExcelReport extends ReportGenerator{
	String tabularData;
	public ExcelReport(String title, String tabularData) {
		super(title);
		this.tabularData = tabularData;
	}
	public void generateContent() {
		System.out.println("Generating Excel content with tabular data.");
	}
	public void openFile() {
		System.out.println("Opening Excel file.");
	}
	public void writeContent() {
		System.out.println("Writing content to Excel file.");
	}
   public void saveFile() {
	   System.out.println("Saving Excel file.");
   }

}

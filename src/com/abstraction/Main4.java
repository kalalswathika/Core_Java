package com.abstraction;

public class Main4 {
	public static void main(String args[]) {
		ReportGenerator report=new PDFReport("Sample Report", "This is a sample block text.");
		report.generateContent();
		report.openFile();
		report.writeContent();
		report.saveFile();
		System.out.println("********************");
		ReportGenerator report1=new ExcelReport("Sample Report", "[Name, Age], [John,30],[Jane, 25]");
		report1.generateContent();
		report1.openFile();
		report1.writeContent();
		report1.saveFile();
		System.out.println("********************");
		ReportGenerator report2=new HTMLReport("Sample Report", "<h1>Sample Report</h1>"+ "<p>This is a sample report.</p>");
		report2.generateContent();
		report2.openFile();
		report2.writeContent();
		report2.saveFile();
	}

}

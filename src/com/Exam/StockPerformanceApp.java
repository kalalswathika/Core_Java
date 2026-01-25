package com.Exam;
import java.util.Scanner;

class StockHandler {
  String handlerName;
  String handlerId;
 StockHandler(String handlerName, String handlerId) {
     this.handlerName = handlerName;
     this.handlerId = handlerId;
 }
}
class StockPerformance extends StockHandler {
  int totalStock;
  int entryCount;
  double averageStock;
 String handlingGrade;
 StockPerformance(String name, String id) {
     super(name, id);
     totalStock = 0;
     entryCount = 0;
     handlingGrade = "Not Calculated";
 }
 public void addStock(int quantity) {
     if (quantity <= 0) {
         System.out.println("Invalid Stock Quantity. Entry rejected.");
     } else {
         totalStock += quantity;
         entryCount++;
         System.out.println("Stock entry added successfully.");
     }
 }
 public void calculatePerformance() {
     if (entryCount == 0) {
         System.out.println("No stock entries available to calculate performance.");
         return;
     }
     averageStock = (double) totalStock / entryCount;

     if (averageStock >= 50) {
         handlingGrade = "Efficient";
     } else if (averageStock >= 30) {
         handlingGrade = "Average";
     } else {
         handlingGrade = "Needs Improvement";
     }

     System.out.println("\nStock Performance Profile Created");
 }

 public void viewSummary() {
     System.out.println("\nStock Performance Summary");
     System.out.println("Handler: " + handlerName);
     System.out.println("Handler ID: " + handlerId);
     System.out.println("Total Stock Handled: " + totalStock);
     System.out.println("Average Stock Per Entry: " + averageStock);
     System.out.println("Handling Grade: " + handlingGrade);
 }
}
public class StockPerformanceApp {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Handler Name: ");
     String name = sc.nextLine();
     System.out.print("Enter Handler ID: ");
     String id = sc.nextLine();
     StockPerformance stock = new StockPerformance(name, id);
     int choice;
     do {
         System.out.println("--- Menu ---");
         System.out.println("1. Add Stock");
         System.out.println("2. Recalculate Result");
         System.out.println("3. View Summary");
         System.out.println("4. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();
         switch (choice) {
             case 1:
                 System.out.print("Enter Stock Quantity: ");
                 stock.addStock(sc.nextInt());
                 break;
             case 2:
                 stock.calculatePerformance();
                 break;

             case 3:
                 stock.viewSummary();
                 break;

             case 4:
                 System.out.println("Exiting program...");
                 break;

             default:
                 System.out.println("Invalid choice. Try again.");
         }

     } while (choice != 4);

     sc.close();
 }
}


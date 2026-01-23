package com.constructor;


class Employe{
	String name;
	double  baseSalary;
public Employe(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
public void calculateAnnualSalary() {
   double Salary=baseSalary*12;
   System.out.println("Salary:"+Salary);
}
}
class Manager extends Employe{
	double bonus;
	int numberOfEmployeesManaged;
	public Manager(String name, double baseSalary, double bonus, int numberOfEmployeesManaged) {
		super(name, baseSalary);
		this.bonus = bonus;
		this.numberOfEmployeesManaged = numberOfEmployeesManaged;
	}
public void calculateManagerSalary() {
	double Msalary=baseSalary+bonus;
	System.out.println("MSalary:"+Msalary);
}
}
class Engineer extends Employe{
	int projectCount;
	public Engineer(String name, double baseSalary, int projectCount) {
		super(name, baseSalary);
		this.projectCount = projectCount;
	}
public void  calculateEngineerSalary() {
	double Esalary=baseSalary+(projectCount*1000);
	System.out.println("ESalary:"+Esalary);
}
}
class Salesperson extends Employe{
	double commissionRate;
	int totalSales;
	public Salesperson(String name, double baseSalary, double commissionRate, int totalSales) {
		super(name, baseSalary);
		this.commissionRate = commissionRate;
		this.totalSales = totalSales;
	}
public void calculateSalespersonSalary() {
	double SSalary=baseSalary+(commissionRate*totalSales);
	System.out.println("SSalary:"+SSalary);
}
}
public class Main1 {
	public static void main(String[] args) {
	Employe manager=new Manager("Alice", 50000, 10000, 5) ;
	manager.calculateAnnualSalary();
	Manager m=(Manager) manager;
	m.calculateManagerSalary();
	System.out.println("-----------");
	Employe engineer=new Engineer("Bob", 70000, 5);
	engineer.calculateAnnualSalary();
	Engineer E=(Engineer) engineer;
	E.calculateEngineerSalary();
	System.out.println("------------");
	Employe salesperson =new Salesperson("Charlie", 40000, 0.1, 200000);
	salesperson.calculateAnnualSalary();
	Salesperson  S=(Salesperson )salesperson;
	S.calculateSalespersonSalary();
	
		

	}

}

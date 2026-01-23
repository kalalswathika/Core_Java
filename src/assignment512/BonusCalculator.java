package assignment512;

public class BonusCalculator {
	public double calculateBonus(int exp, int rate, double salary)
	{
		if(exp>5 && rate>9) {
			return salary*0.50;
		}
		else if((exp>=3 && exp<=5) && (rate>=7 && rate<=9)) {
			return salary*0.30;
		}
		else if((exp>=1 && exp<3) && (rate>=5 && rate<7)) {
			return salary*0.10;
		}
		else {
			return 0.0;
		}
	}
	public static void main(String[] args) {
		BonusCalculator obj=new BonusCalculator();
		System.out.println(obj.calculateBonus(10, 10, 50000.0)); 
		System.out.println(obj.calculateBonus(4, 8, 40000.0));
		System.out.println(obj.calculateBonus(2, 6, 30000.0));
		System.out.println(obj.calculateBonus(0, 3, 20000.0));
	}
}

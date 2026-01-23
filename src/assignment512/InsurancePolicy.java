package assignment512;

public class InsurancePolicy {
	public String calculatePremium(int age, int exp)
	{
		if(age>50 && exp>=10) {
			return "Lowest Premium";
		}
		else if((age>=30 && age<=50) && (exp>=5)) {
			return "Moderate Premium";
		}
		else if((age>=18 && age<30) &&(exp<5)) {
			return "Highest Premium";
		}
		else {
			return "Not Eligible for Insurance";
		}
	}

	public static void main(String[] args) {
		InsurancePolicy obj=new InsurancePolicy();
		System.out.println(obj.calculatePremium(70, 20));
		System.out.println(obj.calculatePremium(42, 9));
		System.out.println(obj.calculatePremium(22, 1));
		System.out.println(obj.calculatePremium(1, 2));
	}
	

}

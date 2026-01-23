package assignment512;

public class UniversityAdmission {
	public String evaluateAdmission(int marks, boolean sportsAchi)
	{
		if(marks>=95) {
			return "Admitted with Scholarship";
		}
		else if(marks>=85 && marks<=94) {
			return "Admitted without Scholarship";
		}
		else if((marks>=70 && marks<=85) &&(sportsAchi=true)) {
			return "Admitted under Sports Quota";
		}
		else if(marks>=60 && marks<=69){
			return "Interview Required";
		}
		else {
			return "Admission Rejected";
		}
	}

	public static void main(String[] args) {
		UniversityAdmission obj=new UniversityAdmission();
		System.out.println(obj.evaluateAdmission(99, false));
		System.out.println(obj.evaluateAdmission(88, false));
		System.out.println(obj.evaluateAdmission(77, true));
		System.out.println(obj.evaluateAdmission(66, false));
		System.out.println(obj.evaluateAdmission(55, false));
	}

}

package assignment412;

public class EligibilitytoVote {
	public boolean canVote(int age) {
		if(age>=18) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		EligibilitytoVote obj=new EligibilitytoVote();
		if(obj.canVote(20)) {
			System.out.println("Can vote(Age 20)?"+obj.canVote(20));
		}
		else {
			System.out.println("Can vote(Age 20)?"+obj.canVote(20));
		}

	}

}

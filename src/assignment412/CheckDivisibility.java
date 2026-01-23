package assignment412;

public class CheckDivisibility {
	public boolean isDivisibilityBy5(int num) {
		if(num%5==0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		CheckDivisibility obj=new CheckDivisibility();
		System.out.println(obj.isDivisibilityBy5(15));

}
}

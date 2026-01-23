package assignment412;

public class checkEvenOrOdd {
	public boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
	checkEvenOrOdd obj=new checkEvenOrOdd();
	if(	obj.isEven(10)) {
		System.out.println("Is 10 even?"+obj.isEven(10));
	}else {
		System.out.println("Odd Number");
	}
	
	}
}

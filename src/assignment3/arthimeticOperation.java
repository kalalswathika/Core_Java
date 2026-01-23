package assignment3;

public class arthimeticOperation {
	int x=5;
	int y=3;
	public void methodCalculate() {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x%y);
		System.out.println(x/y);
		System.out.println("*********************");
		++x;
		y++;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x%y);
		System.out.println(x/y);
	}
	public static void main(String[] args) {
		arthimeticOperation obj=new arthimeticOperation();
		obj.methodCalculate();
	}
}

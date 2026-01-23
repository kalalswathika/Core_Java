package assignment412;

public class GreaterNumber {
	public int findGreater(int num1,int num2) {
		if(num1>num2) {
			return num1;
		}else{
			if(num1<num2) {
				return num2;
			}else {
				return num1=num2;
			}
		}
	}
	public static void main(String[] args) {
		GreaterNumber obj=new GreaterNumber();
		System.out.println(obj.findGreater(20,30));
		System.out.println("Greater number(20,30):"+obj.findGreater(20,30));
	}

}

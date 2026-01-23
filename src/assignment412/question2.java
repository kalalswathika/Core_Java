package assignment412;

public class question2 {
	public String checkNumber(int num) {
		if(num>0) {
		 return "Positive";
		}
		else {
			if(num<0) {
				return "Negative";
			}else {
				return"Zero";
			}
		}
	}
	public static void main(String[] args) {
     question2 obj=new question2();
     String result=obj.checkNumber(20);
     System.out.println(result);
     obj.checkNumber(0);
     System.out.println(obj.checkNumber(0));
     System.out.println(obj.checkNumber(-20));
     System.out.println("Check 10:"+obj.checkNumber(10));
	}
}

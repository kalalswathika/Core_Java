package assignment3;

public class Relational {
	 public static boolean checkLogin(int age, boolean hasId) {
	        return age > 18 && hasId;
	    }

	    public static void main(String[] args) {
	        System.out.println(checkLogin(16, true));
	        System.out.println(checkLogin(22, false)); 
	        System.out.println(checkLogin(25, true));   
	    }
	}

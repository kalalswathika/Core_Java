package assignment3;

public class Complex {
	 public static boolean validate(int a, int b, int c) {
	        return (a > b && b < c) || !(a == c);
	    }
	    public static void main(String[] args) {
	        System.out.println(validate(10, 5, 20));  // true
	        System.out.println(validate(5, 10, 5));   // false
	        System.out.println(validate(5, 3, 5));    // true
	    }
	}

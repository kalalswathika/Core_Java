package assignment3;

public class Compound {
	    public static void calculate() {

	        int score = 50;
	        int bonus = 10;
	        System.out.println("Score = " + score);
	        System.out.println("Bonus = " + bonus);
	        score += bonus;
	        System.out.println("After score += bonus → " + score);
	        score -= 5;
	        System.out.println("After score -= 5 → " + score);
	        score *= 2;
	        System.out.println("After score *= 2 → " + score);
	        score /= 5;
	        System.out.println("After score /= 5 → " + score);
	        score %= 3;      
	        System.out.println("After score %= 3 → " + score);
	        bonus += 5;
	        System.out.println("After bonus += 5 → " + bonus);
	        bonus *= 2;
	        System.out.println("After bonus *= 2 → " + bonus);
	    }

	    public static void main(String[] args) {
	        calculate();
	    }
	}

package JavaBasics;

public class FactorialNumber {

	// factorial of 4 = 4*3*2*1 = 24
	// factorial of 5 = 5*4*3*2*1 = 120
	// factorial of 10 = 10*9*8*7*6*5*4*3*2*1 =
	// factorial of 1 = 1
	// factorial of (0) = 1

	// 1.without recursive - use for loop

	public static int factorial(int num) {
		int fact = 1;
		if (num == 0)
			return 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	// 2nd approach: with recursive function: a function is calling itself
	public static int fact(int num) {
		if (num == 0)
			return 1;

		else
			return (num * fact(num - 1));
	}

	public static void main(String[] args) {
		System.out.println("Withöut Recursive method factorial: " +factorial(3));
		System.out.println("Withöut Recursive method factorial: " +factorial(4));
		System.out.println("Withöut Recursive method factorial: " +factorial(1));
		System.out.println("Withöut Recursive method factorial: " +factorial(0));
		
		System.out.println("With Recursive method fact: "+fact(10));
		System.out.println("With Recursive method fact: "+fact(1));
		System.out.println("With Recursive method fact: "+fact(0));

	}

}

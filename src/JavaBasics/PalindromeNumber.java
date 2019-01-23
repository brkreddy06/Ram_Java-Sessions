package JavaBasics;

public class PalindromeNumber {

	public static void isPolindromeNumber(int num) {
		int r = 0;
		int sum = 0;
		int t;

		t = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (t==sum) {
			System.out.println(t + " - Polinedrome number");
		} else {
			System.out.println(t + " - Not a Polinedrome number");
		}
	}

	public static void isPolindromeString(String name) {
		String rev = "";
		int length = name.length();

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println("The reverse of the name - " + rev);
		if (rev.equals(name)) {
			System.out.println(rev + " - is a polindrome");
		} else
			System.out.println(rev + " - not a polindrome");

	}

	public static void main(String[] args) {
		// the reverse of the number or string is called palindrome
		// int num = 1510;
		// int rev=0;
		// int n=0;
		// int t;
		// t=num;
		// while(num>0){
		// n = num%10;
		// rev = (rev*10) + n;
		// num = num/10;
		// }
		// //System.out.println("The reverse of the number is: " + rev);
		// if(t==rev){
		// System.out.println(t + "- This is Polinedrome number");
		// }else System.out.println(t +"- This is not number a polindrome");
		//
		// }
		isPolindromeNumber(151);
		isPolindromeNumber(15109);

		isPolindromeString("MADAM");
		isPolindromeString("Madam");

	}
}

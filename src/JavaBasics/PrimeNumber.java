package JavaBasics;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i<num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getPrimeNumbers(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i + "");
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		// Prime number can be divisible by itself (ex:2/2 3/3, 5/5, 7/7, etc.)
		// 1 and 0 are not a prime number
		// non-prime numbers - 2 - 2/1 & 2/2, 4 - 4/2 & 4/4 etc.

//		System.out.println("-10 is a prime number - " + isPrimeNumber(-10));
//		System.out.println("-2 is a prime number - " + isPrimeNumber(-2));
//		System.out.println("0 is a prime number - " + isPrimeNumber(0));
//		System.out.println("1 is a prime number - " + isPrimeNumber(1));
//		System.out.println("51 is a prime number? - " + isPrimeNumber(51));
//		System.out.println("3 is a prime number - " + isPrimeNumber(3));
//		System.out.println("4 is a prime number - " + isPrimeNumber(4));
		System.out.println("8 is a prime number - " + isPrimeNumber(8));

//		getPrimeNumbers(4);
		getPrimeNumbers(20);

	}

}

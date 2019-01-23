package JavaBasics;

public class ArmstrongNumber {

	public static void isArmstrongNumber(int num) {
		int cube = 0;
		int r;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10;
			cube = cube + (r * r * r);
			num = num / 10;
		}
		if (t == cube) {
			System.out.println(t + " - is an Armstrong number");
		} else {
			System.out.println(t + " - is not an Armstrong number");
		}
	}

	public static void main(String[] args) {
		// the cubic of every digit and if we do the sum these number, then this
		// -
		// sum equals to given number is called Armstrong number
		// ex: 0,1,153,370,371, 407,
		// 1*1*1 = 1
		// 5*5*5 = 125
		// 3*3*3 = 27
		// 1+125+27 = 153
		
		isArmstrongNumber(-2);
		isArmstrongNumber(1);
		isArmstrongNumber(153);
		isArmstrongNumber(1532);

	}

}

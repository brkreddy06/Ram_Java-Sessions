package JavaBasics;

public class IntigerReverse {
	
	public static void intReverse(int num) {
		System.out.println("Given number is: "+ num);
		int rev =0;
		int remainder;
		int temp;
		temp=num;
		while(num>0) {
			remainder = num%10;
			rev = (rev*10)+remainder;
			num=num/10;
		}
		System.out.println("The reverser of the given number"+ rev);
		
		if(temp == rev) {
			System.out.println("This is a polindrome number");
		}else System.out.println("not a polindrome");
	}
	

	public static void main(String[] args) {
//		int number = 1234;
//		System.out.println("Actual number:" + number);
//		int reverse = 0;
//		//while(number%10!=0)
//		while(number>0){
//			int n = number%10;
//			reverse = reverse*10+n;
//			number = number/10;
//		}
//			System.out.println("Reverse of the actual number:" + reverse);
		intReverse(121);

	}

}

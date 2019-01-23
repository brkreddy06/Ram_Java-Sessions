package JavaBasics;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random obj = new Random();
		int number;
		
		for(int i=0; i<=10; i++) {
			number = 1+obj.nextInt(10);
			System.out.println(number);
		}

	}

}

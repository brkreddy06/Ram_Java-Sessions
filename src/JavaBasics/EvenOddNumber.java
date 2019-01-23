package JavaBasics;

public class EvenOddNumber {

	public static void evenNumber(int num) {

		for (int i = 1; i < num; i++) {
			if (i % 2 == 0) {

				System.out.print("Even number: " + i);
			} else
				//System.out.println("Odd number: " + i);
				System.out.println("");
		}

	}

	public static void main(String[] args) {
//		for(int i=1; i<=10; i++){
//			if(i%2==0){
//				
//				System.out.println("Even number - "+i);
//				
//			}else System.out.println("Odd number -"+i);
//		}

		evenNumber(10);

	}

}

package Programs;

public class PractiseClass {

	public static void main(String[] args) {
		//test1();
		division();
	}
	
	//finally keyword
	public static void test1() {
		try {
			System.out.println("this is try block");
			throw new RuntimeException("Test");
		}catch (Exception e) {
			
			System.out.println("This is Catch block");
		}
		finally {
			System.out.println("This is finally block");
		}
	}
	
	public static void division() {
		int i =10;
		try {
			System.out.println("This is try block");
			int k = i/0;
		}catch (NullPointerException e){ //if we out ArithmeticException instead of NullPointerException then it will execute catch block as well
			System.out.println("Catch block");
			System.out.println("divide by zero error");
			//System.exit(1); -- it will ignore finally block execution
		}
		finally {
			System.out.println("Finally block -- execute this code even after any exception");
		}
	}

}

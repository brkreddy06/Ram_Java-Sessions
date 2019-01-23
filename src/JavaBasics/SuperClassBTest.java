package JavaBasics;

public class SuperClassBTest extends SuperClassA {

	public SuperClassBTest() {
		super(); // super keyword is used to call the parent class constructor
					// super keyword should declare in first line
		// super keyword should always written inside the child class
		// constructor
		System.out.println("Child class constructor");
	}

	public SuperClassBTest(int i) {
		super(i);
	}

	public SuperClassBTest(int i, int j) {
		super(i, j);

	}

	public static void main(String args[]) {

		SuperClassBTest obj = new SuperClassBTest();
		SuperClassBTest obj1 = new SuperClassBTest(10);
		SuperClassBTest obj2 = new SuperClassBTest(20, 30);

	}

}

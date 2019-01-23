package Programs;

public class SwappingofTwoStringValue {

	public static void main(String[] args) {
		
		String a ="Ramkumar Reddy 123";
		String b ="Gentleman";
		
		System.out.println("Before Swapping of a and b:");
		System.out.println("the value of a: "+a);
		System.out.println("the value of b: "+b);
		
		//1.Append a and b
		a=a+b;//RamkumarGentleman
		
		//2.store initial string a in String b
		b=a.substring(0, a.length()-b.length());
		
		//3.store initial string b in String 
		a=a.substring(b.length());
		
		//After swapping
		System.out.println("After Swapping of a and b:");
		System.out.println("the value of a: "+a);
		System.out.println("the value of b: "+b);

	}

}

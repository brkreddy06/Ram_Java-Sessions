package Programs;

public class SwappingOfIntigers {

	public static void main(String[] args) {
		
		int a =10;
		int b=15;
		//1.with using temp variable
		
//		int temp;
//		temp =a;//temp=10
//		a=b; //a=15
//		b=temp; //b=10
//		
//		System.out.println("a value: "+a);
//		System.out.println("b value: "+b);
		
		//2.without using temp and by using + operator
//		a=a+b; //a=10+15=25
//		b=a-b; //b=25-15 = 10
//		a=a-b; //a = 25-10 = 15
		
		//3.without using temp variable and by using * operator
//		a=a*b; //a=10*15 = 150
//		b=a/b; //b=150/15 = 10
//		a=a/b; //a=150/10 = 15
		
		//4.using XOR: ^
		a=a^b; 
		b=a^b;
		a=a^b;
		
		System.out.println("a value: "+a);
		System.out.println("b value: "+b);
		

	}

}

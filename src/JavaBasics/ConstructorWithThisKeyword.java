package JavaBasics;

public class ConstructorWithThisKeyword {
	
	//class variable 
	String name1;
	String name;
	int age;
//	char a;
//	boolean b;
//	double d;
//	long l;
	
	public ConstructorWithThisKeyword(String name, int age){
		this.name = name;
		this.age = age;
		//name1 = name; 
		
		System.out.println(name);
		System.out.println(age);
		
		
	}

	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 25);
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.name1);
//		System.out.println(obj.a);
//		System.out.println(obj.b);
//		System.out.println(obj.d);
//		System.out.println(obj.l);
		
	}

}

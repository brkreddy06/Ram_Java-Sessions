package JavaBasics;

public class StaticandNonStaticConcept {

	String name = "Ram"; //non static global variable
	static int age =30; // static global varible
	
	public static void main(String[] args) {
		//how to call static method and variable?
		//1.direct calling 
		sum();
		//2.calling by classname
		StaticandNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticandNonStaticConcept.age);
		//System.out.println(name); - it give error
		
		//how to call non static method and variable 
		StaticandNonStaticConcept obj = new StaticandNonStaticConcept();
		obj.sendAMail();
		System.out.println(obj.name);
		
		//can i access static method by using object reference? Yes
		
		obj.sum(); //it gives warning message
		System.out.println(obj.age);
		

	}
	
	public void sendAMail(){
		System.out.println("Send mail method");
	}
	
	public static void sum(){
		
		System.out.println("Sum method");
	}
	

}

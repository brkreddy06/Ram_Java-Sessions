package JavaBasics;

public class ClassC extends ClassB{
	
	public void cMethod1(){
		System.out.println("Class cMethod1");
	}
	
	public void cMethod2(){
		System.out.println("Class cMethod2");
	}
	
	//ClassC objC = new ClassC();
	
	public void cExtendsBandAmethods(){
		ClassC objC = new ClassC();
		System.out.println("*** cExtendsBandAmethods ***");
		//Accessing ClassA methods
		objC.aMethod1();
		objC.aMethod2();
		objC.aMethod3();
		
		//Accessing ClassB methods
		objC.bMethod1();
		objC.bMethod2();
		objC.bMethod3();
		
		//Assessing its own class methods
		objC.cMethod1();
		objC.cMethod2();
		
	}
	
	
}

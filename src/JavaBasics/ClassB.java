package JavaBasics;

public class ClassB extends ClassA{
	
	//ClassB objB = new ClassB();
	
	public void bMethod1(){
		System.out.println("Class bMethod1");
	}
	
	public void bMethod2(){
		System.out.println("Class bMethod2");
	}
	
	public void bMethod3(){
		System.out.println("Class bMethod3");
	}
	
	public void bExtendsAmethods(){
	ClassB objB = new ClassB();
	System.out.println("*** bExtendsAmethods ***");
	objB.aMethod1();
	objB.aMethod2();
	objB.aMethod3();
	}
	
	public void aExtendsBmethods(){
		ClassA objA = new ClassA();
		System.out.println("*** aExtendsBmethods ***");
		
		//objA.bMethod(); - ClassA(parent class) can not access methods defined in ClassB, however it can access its own methods
		objA.aMethod1();
		
	
	}

}

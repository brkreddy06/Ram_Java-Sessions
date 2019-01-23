package JavaBasics;

public class ConstructorConcept {
	
	public ConstructorConcept(){
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i){
		System.out.println("Single parameter Constructor ");
		System.out.println("The vakue of i " + i);
		
	}
	
	public ConstructorConcept(int i, String j){
		System.out.println("Two parameter Constructor");
		System.out.println("The value of i " + i);
		System.out.println("The name of j " + j);
		
	}

	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(20, "Ram");
		

	}

}

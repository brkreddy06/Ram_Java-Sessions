package AbstractionConcept;

public abstract class Bank {
	
	//can create final,non static & static variables
	int amt = 100;
	static int loanRate = 5;
	final int rate=10;
	
	//Partial abstraction 
	//hiding the implementation logic -- is called Abstraction (OOP Concept)
	//Abs can have abs methods and non abs methods
	//can not create the object of abstract class
	
	public abstract void loan(); //abstract method -- no method body
	
	//non abstract methods
	public void credit(){
		System.out.println("Bank -- Credit");
	}

	public void debit(){
		System.out.println("Bank -- Debit");
	}
}

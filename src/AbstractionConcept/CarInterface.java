package AbstractionConcept;

public interface CarInterface {
	
	//only final & static variables 
	int wheels = 4;
	final int rate = 100;
	
	//Always defined Abstract methods
	//no method body
	//only method declaration
	//we achieve 100% abstraction 
	//can not create the object of interface
	
	public void start();
	public int stop();
	public boolean fuel();

}

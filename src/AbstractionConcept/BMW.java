package AbstractionConcept;

public class BMW implements CarInterface{

	@Override
	public void start() {
		System.out.println("BMW Start");
		
	}

	@Override
	public int stop() {
		System.out.println("BMW -- Stop");
		return 0;
	}

	@Override
	public boolean fuel() {
		System.out.println("BMW - Fuel");
		return false;
	}
	
	public void TheftSafety(){
		System.out.println("BMW - Theft Safety");
	}

}

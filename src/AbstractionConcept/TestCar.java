package AbstractionConcept;

public class TestCar{

	public static void main(String[] args) {
		BMW obj = new BMW();
		obj.start();
		obj.stop();
		obj.fuel();
		obj.TheftSafety();
		
		System.out.println("Parent interface");
		CarInterface car = new BMW();
		car.start();
		car.stop();
		car.fuel();
		//car.TheftSafety() - can not be accessed by the parent interface class CarInterface

	}

}

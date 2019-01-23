package JavaBasics;

public class SuperClassA {
	
	public SuperClassA(){
		System.out.println("Parent class constructor");
	}
	
	public SuperClassA(int i){
		System.out.println("Single Parameter Constructor value of i " + i);
	}
	
	public SuperClassA(int i, int j){
		System.out.println("Single Parameter Constructor value of i " + i);
		System.out.println("Single Parameter Constructor value of j " + j);
	}

}

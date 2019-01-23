package JavaBasics;

public class CallByValuAndCallByReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValuAndCallByReference obj = new CallByValuAndCallByReference();
		int x=10;
		int y=20;
		int print = obj.testSum(x, y);//call by value or pass by value
		System.out.println(print);
		
		obj.p = 50;
		obj.q = 60;
		System.out.println("before swap" + " P = "+obj.p+ " "+ "Q ="+ obj.q);
		
		obj.swap(obj);
		System.out.println("After swap"+ " P = "+obj.p+ " "+ "Q ="+ obj.q);
		
	}
	
	public int testSum(int a, int b){
		a = 20;
		b = 30;
		int c=a+b;
		return c;
		
	}
	
	//call by reference
	public void swap(CallByValuAndCallByReference t){
		int temp;
		temp = t.p; //temp =50
		t.p=t.q; //t.p = 60
		t.q = temp; //t.q =50
		
		
		
	}

}

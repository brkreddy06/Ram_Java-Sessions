package JavaBasics;

public class StringReverse {

	public static void main(String[] args) {
		String name = "B Ramkumar Reddy";
		String reverse="";
		int length = name.length();
		
		for(int i=length-1; i>=0; i--){
			reverse = reverse + name.charAt(i);
		}
		System.out.println("String is reversed:" + reverse);
	}

}

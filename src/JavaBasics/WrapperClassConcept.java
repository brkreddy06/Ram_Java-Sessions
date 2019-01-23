package JavaBasics;

public class WrapperClassConcept {
	
	public static void main(String srgs[]){
		
		String x = "100";
		System.out.println(x+20);//o/p - 10020
		
		//data conversion: String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Character, Boolean
		
		//String to Double
		String y = "20.55";
		double d = Double.parseDouble(y);
		System.out.println(d+12.25);
		
		//String to Boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to String
		int j = 200;
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		//java.lang.NumberFormatException --For input string: "100A", can possible to convert non numeric value into integer 
		String u = "100A";
		int n = Integer.parseInt(u);
		System.out.println(n);
		
		
	}

}

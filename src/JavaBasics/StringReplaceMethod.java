package JavaBasics;

public class StringReplaceMethod {
	
	

	public static void main(String[] args) {
		
		String name =new String("My name is ramu");
		System.out.println("Before name change: "+name);

		name = name.replaceFirst("My", "Your");
		name = name.replaceFirst("ramu", "kumar");
		System.out.println(name);
		
//		String replaceAll= name.replaceAll("My name is ramu", "your name is Sai");
//		System.out.println(replaceAll);
	
		
		//How to remove junk letters in a String
		//By using regular expression - [^a-zA-Z0-9]
		
		String s = "!@#$$$ Test Data Selenium 12345 () java";
		s = s.replaceAll("[^a-z A-Z 0-9 $]", "");
		System.out.println(s);
		

	}

}

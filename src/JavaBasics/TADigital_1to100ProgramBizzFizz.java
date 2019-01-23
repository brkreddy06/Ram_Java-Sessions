package JavaBasics;

public class TADigital_1to100ProgramBizzFizz {

	public static void main(String[] args) {
		//to write a program - number divided by 3 - output = fizz, number/5 -o/p = bizz. num/3+num/5 - o/p - fizzbizz
		
		int num=100;
		String a = "Fizz";
		String b = "Bizz";
		for(int i=1; i<=num; i++){
			if(i%3==0 && i%5==0){
				System.out.println("Divisible 3 + 5 condition satisfied number: " + i);
				System.out.println(a+b);
			}else if(i%3==0){
				System.out.println("Divisible 3 condition satisfied number: " + i);
				System.out.println(a);
			}else if(i%5==0){
				System.out.println("Divisible 5 condition satisfied number: " + i);
				System.out.println(b);
			}else System.out.println("");
		}

	}

}

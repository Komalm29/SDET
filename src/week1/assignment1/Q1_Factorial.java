package week1.assignment1;

public class Q1_Factorial {


	
	public static void main(String[] args) {
		int num = 6;
		int fact = 1;
		
		while(num>1) {
			
			fact = fact * num;
			num--;
		}
		System.out.println(fact);
	
	}

}

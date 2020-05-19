package week1.assignment1;

public class Q2_fabonacci {

	public static void main(String[] args) {
		
		int fab = 0;
		int first = 1;
		
		System.out.println("fabonacci Series: ");		
		for(int i=1; i<10; i++) {
			
			System.out.print(fab);
			
			int sum = fab + first;
			fab = first;
			first = sum;
			
		}
		
		//0 1 1 2358 13 21

	}

}

package HomeWorkAssignments;

public class Q3_PrimeNumber {
	
	int num = 13;
	int rem;
	int sum=0;
	
	public void prime() {
		
		if(num%2 == 0)
		{
			System.out.println("No, 13 is a prime number");
		}else {
			System.out.println("Yes, 13 is a prime number");
		}
	}
	
	public static void main(String[] args) {
		Q3_PrimeNumber pm = new Q3_PrimeNumber();
		pm.prime();
	}

}

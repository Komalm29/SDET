package HomeWorkAssignments;

public class Q4_AddNumbers {
	
	public static void main(String[] args) {
	
		int num = 1234;
		int sum =0;
		int rem =0;;
		
		while(num!=0)
		{
			rem = num%10;
			sum = sum+rem;
			num = num/10;		
		}
		
		System.out.println("Addition is: " + sum);

	}

}

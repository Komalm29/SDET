package HomeWorkAssignments;

public class Q5_Reverse {

	public static void main(String[] args) {
		int num = 123;
		int sum =0;
		int rem =0;
		
		while(num!=0)
		{
			rem = num%10;
			sum = sum*10+rem;
			num = num/10;		
		}
		System.out.println(" Reverse of number is: "+ sum);

	}

}

package week1.Lab4;

public class Q1_LA {

	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int c = 6;
		
		if((a > b) &&(a>c))
		{
			System.out.println("Largest number is: " + a);
		}else if((c > b) &&(c > a))
		{
			System.out.println("Largest number is: " + c);
		} else if((b > a) &&(b > c))
		{
			System.out.println("Largest number is: " + b);
		}else
			{
				System.out.println("Largest number not found");
			}

	}

}

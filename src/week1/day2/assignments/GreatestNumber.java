package week1.day2.assignments;

public class GreatestNumber {
	
	int num1 = 85;
	int num2 = 58;
	int num3 = 10;
	
	public void greatestNum(){
		
		System.out.println("The greatest number is:");
			if((num1 > num2) && (num1 > num3))
			{
				System.out.println(num1);
			}
			else if((num2 > num1) && (num2 > num3))
			{
				System.out.println(num2);
			}
			else if((num3 > num1) && (num3 > num2))
			{
				System.out.println(num3);
			}
			else
			{
				System.out.println("Greatest number not found");
			}
	}

	public static void main(String[] args) {
		GreatestNumber gn = new GreatestNumber();
		gn.greatestNum();
	}

}

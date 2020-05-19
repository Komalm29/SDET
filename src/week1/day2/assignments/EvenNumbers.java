package week1.day2.assignments;

public class EvenNumbers {
	
	
	public void calculation(){
		
		System.out.println("The even numbers are:");		
		for(int i=1; i<=150; i++) {
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		EvenNumbers en = new EvenNumbers();
		en.calculation();
	}

}

package HomeWorkAssignments;

public class Calculator {
	
	int num1;
	int num2;
	
	public Calculator(int num1, int num2) {
	this.num1 = num1;
	this.num2 = num2;
	}
	
	static void add(int num1, int num2) {
		System.out.println("Addition is: " + (num1 + num2));
	}
	
	static void div(int num1, int num2) {
		System.out.println("Division is: " + (num1 / num2));
	}
	
	public void sub() {
		System.out.println("Substraction is: " + (num1 - num2));
	}
	
	
	public void mul() {
		System.out.println("Multiplication is: " + (num1 * num2));
	}


}

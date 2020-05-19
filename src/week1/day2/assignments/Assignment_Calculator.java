package week1.day2.assignments;

public class Assignment_Calculator {
	int a;
	int b;
	
	
	/*public Assignment_Calculator() {
		System.out.println("Calculator constructor");
	}*/
	
//	public Assignment_Calculator(int c, int d) 
	public Assignment_Calculator(int a, int b) {
		//a = c;
		//b = d;
		this.a = a; //this means "current class"
		this.b = b;
		System.out.println("I am an Overloading Constructor");	
	}
	
	public void add(){
		System.out.println("addition: " + (a+b));
	}
	
	private void sub(){
		System.out.println("Substraction: " + (a-b));
	}
	
	protected void mul(){
		System.out.println("Multiplication: " +(a*b));
	}
	
	public static void main(String[] args) {
		Assignment_Calculator calc = new Assignment_Calculator(40,3);
		calc.add();
		calc.sub();
		calc.mul();
	}
}

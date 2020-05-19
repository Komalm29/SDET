package week1.day2.assignments;

public class MyCal {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		//for method-1
		//calc.add();
		//calc.mul();
		
		//System.out.println("cannot call private class");
		
		//for method-2
		System.out.println(calc.add());
		System.out.println(calc.mul());
	}

}

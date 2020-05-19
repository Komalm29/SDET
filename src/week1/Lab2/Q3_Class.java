package week1.Lab2;

public class Q3_Class {
	
	//constructor
	public Q3_Class() {
		System.out.println("Constructor");
	}
	
	
	//parimeterized Constructor
	public Q3_Class(int i) {
		System.out.println("parameterized Constructor");
	}

	public static void main(String[] args) {
		// Object
		
		Q3_Class classObject = new Q3_Class();
		Q3_Class constObject = new Q3_Class(10);
		

		//attributes
		int num = 10;
		int sum = num + num;
		System.out.println(sum);
	}

}

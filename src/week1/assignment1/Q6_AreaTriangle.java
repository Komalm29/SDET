package week1.assignment1;

import java.util.Scanner;

public class Q6_AreaTriangle {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base of a triangle");
		int base = input.nextInt();
		
		System.out.println("Enter the height of a triangle");
		int height = input.nextInt();
		
		input.close();
		
		int area = base * height;
		System.out.println("Area of a traingle is: " + area);
	}

}

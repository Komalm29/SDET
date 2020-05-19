package week1.assignment1;

import java.util.Scanner;

public class Q4_LeapYear {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = input.nextInt();
		
		input.close();
		
		if(year%4 == 0) {
			System.out.println("Yes, it is a leap year");
		}
		else
			System.out.println("No, it is not a leap year");

	}

}

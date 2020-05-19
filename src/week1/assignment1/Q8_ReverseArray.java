package week1.assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Q8_ReverseArray {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = input.nextInt();
		
		System.out.println("enter the array elements");
		int arr[]= new int[size];
		
		for(int i=0; i<size; i++) {
			int num = input.nextInt();
			arr[i] = num;
		}
		
		for(int j=arr.length-1; j>=0; j--) {
			System.out.println(arr[j]);
		}
		
		
		
		
	}

}

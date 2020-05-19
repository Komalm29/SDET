package week1.Lab6;

public class Q1_AvgArray {
	
	public static void main(String[] args){
		
		int sum = 0;
		double avg;
		
		int arr[] = {1,2,3,4,5};
		
		for(int i = 0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		
		avg = sum/arr.length;
		System.out.println("average of array elements is: " + avg);
		

	}

}

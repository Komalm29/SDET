package HomeWorkAssignments;

import java.util.Arrays;
public class Q6_DuplicatesInArray {
	
	int arr[] = {12, 32, 12, 45, 65, 0,93, 23, 45, 6};
	
	
	public void array() {
		
		Arrays.sort(arr);
		
		for(int i =0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int j =0; j<arr.length-1;j++)
		{
			if(arr[j] == arr[j+1])
			{
				System.out.println("Duplicate value is: " + arr[j]);
			}
			else
				continue;
			
		}
		
	}
		
	public static void main(String[] args) {

		Q6_DuplicatesInArray duplicate = new Q6_DuplicatesInArray();
		duplicate.array();
	}

}

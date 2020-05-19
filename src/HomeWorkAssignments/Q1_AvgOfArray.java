package HomeWorkAssignments;

public class Q1_AvgOfArray {

	int values [] = {1,2,3,4,5};
	double average;
	
	public double Average() {
		double sum = 0;
		
		for(int i=0; i<values.length;i++) {
			sum = sum + values[i];
		System.out.println("sum is: "+ sum);
		}
		
		average = sum/values.length ;
		
		return average;
	}
	public static void main(String[] args) {
		Q1_AvgOfArray avg = new Q1_AvgOfArray();
		double arrayAvg = avg.Average();
		System.out.println("Average of Array is: " + arrayAvg);
	}

}

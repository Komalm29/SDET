package week1.day1.assignments;

public class assignmentArrays {

	public static void main(String[] args) {
		String names[] = {"RB", "Kuldeep", "Ravi", "Monika", "Myname", "Koushik"};

		int len = names.length;
		System.out.println("Even names are: ");
		
		for(int i=0; i <len; i++) {
			
			if( i%2 != 0)
			{
				continue;
			}
			System.out.println(names[i]);
		}

	}

}

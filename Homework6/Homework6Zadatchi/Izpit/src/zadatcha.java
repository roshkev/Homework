import java.util.Scanner;

public class zadatcha {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		
		int n = input.nextInt();
		
		int[] array = new int[n];
		
		for (int i = 2; i < n; i++) {
			
			for (int index = 0; index < array.length; index++)	
				
			array[i] = input.nextInt();
         
			
		
	}

}
}
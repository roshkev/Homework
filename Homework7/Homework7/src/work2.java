import java.util.Scanner;

public class work2 {

	public static void main(String[] args) {
		
		int [][] matrix =new int [2][2];
		Scanner input = new Scanner(System.in);
		
		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = input.nextInt();
				
			}

		}
		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");

			}
			System.out.println();
		

	}

}
}
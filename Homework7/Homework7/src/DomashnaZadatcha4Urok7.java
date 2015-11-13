import java.util.Scanner;

public class DomashnaZadatcha4Urok7 {

	public static void main(String[] args) {

		Scanner numbers = new Scanner(System.in);

		int[][] matrix = new int[3][4];

		System.out.println("Vavedete tcisla: ");

		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix[row].length; col++) {

				int n = numbers.nextInt();

				matrix[row][col] = n;
			}
		}
		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix[row].length; col++) {

				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();

		}
		numbers.close();

	}

}

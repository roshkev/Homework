
public class uprajnenia5 {

	public static void main(String[] args) {

		int[][] matrix = {
				{ 5, 8, 2 }, 
				{ 9, 10, 13 }, 
				{ 7, 9, 4 },

		};
		int max = Integer.MIN_VALUE;
		
		int maxRow = 0;
		int maxCol = 0;

		int min = Integer.MAX_VALUE;
		int minRow = 0;
		int minCol = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
					maxRow = i;
					maxCol = j;

				}
				if (matrix[i][j] < min) {
					min = matrix[i][j];
					minRow = i;
					minCol = j;

				}
			}

		}
		System.out.println("The maximul number is "+ max +" The position is " + maxRow+ " and "+ maxCol);
		System.out.println("The minimal number is "+ min +" The position is " + minRow+ " and "+ minCol);

	}

}

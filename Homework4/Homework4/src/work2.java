import java.util.Scanner;

public class work2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 1; i < 10; i++) {
			int n = scanner.nextInt();
			if (n > max) {

				max = n;
			}

			if (n < min) {
				min = n;
				
			}
		}
		System.out.println("MAX:" + max);
		System.out.println("MIN:" + min);
	}

}

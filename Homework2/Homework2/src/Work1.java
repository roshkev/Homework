import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please input a number");

		int number = input.nextInt();

		if (number == 1) {
			System.out.println("Monday");

		} else if (number == 2) {
			System.out.println("Thuasday");

		} else if (number == 3) {
			System.out.println("Wensday");

		} else if (number == 4) {
			System.out.println("Thesday");

		} else if (number == 5) {
			System.out.println("Friday");

		} else if (number == 6) {
			System.out.println("Saturday");

		} else if (number == 7) {
			System.out.println("Sunday");

		} else {
			System.out.println("Invalid day");

			input.close();
		}

	}

}

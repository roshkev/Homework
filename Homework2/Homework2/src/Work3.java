import java.util.Scanner;

public class Work3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please input a points:");

		int number = input.nextInt();

		switch (number) {
		case 1:
		case 2:
		case 3:
			if (number >= 1 || number <= 3)
				;

			System.out.println(number * 5);
			break;

		case 4:
		case 5:
		case 6:
			if (number <= 4 || number <= 6)
				;

			System.out.println((number * 10));
			break;

		case 7:
		case 8:
		case 9:
			if (number <= 5 || number <= 9)
				;

			System.out.println((number * 50));
			break;

		default:
			System.out.println("Invalid point!");
			break;
		}

	}
}
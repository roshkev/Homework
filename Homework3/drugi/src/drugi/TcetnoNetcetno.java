package drugi;

import java.util.Scanner;

public class TcetnoNetcetno {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Molq vavedete tcislo");

		int number = input.nextInt();

		if (number >= 1 && number <= 5) {

			if (number % 2 == 0) {

				System.out.println("tcetno");

			} else {
				System.out.println("netcetno");
			}

		} else if (number >= 6 && number <= 15) {
			if (number % 2 == 0) {

				System.out.println("se deli na 3 bez ostatak");

			} else {
				System.out.println("se deli na 3 s ostatak");
			}

		} else {
			if (number >= 0) {
				System.out.println("e polojitelno");

			} else if (number < 0) {
				System.out.println("e otricatelno");
			} else {
				System.out.println("e nula");
			}

		}
		input.close();
	}

}


public class DomashnaZadatcha3PopravkaUrok8 {

	public static void main(String[] args) {

	}

	static float number = 9.0f;
	static float number1 = comparesfloat(number);

	public static float comparesfloat(float number2) {

		if (number2 % 2 == 0) {
			number = number2;
			System.out.println("The number is Even!");

		}

		if (number2 % 2 == 1) {
			number = number2;

			System.out.println("The number is Odd!");

		}
		return number2;

	}

}


public class DomashnaZadatcha1 {

	public static void main(String[] args) {

		int[] myArray = new int[] { 1, 4, 8, 3, 5 };

		int sum = 0;

		for (int i = 0; i < myArray.length; i++) {

			if (myArray[i] % 2 == 0)

				sum = sum + myArray[i];

		}
		System.out.println(sum);
	}
}

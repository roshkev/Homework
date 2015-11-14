
public class DomashnaZadatcha1Urok8 {

	public static void main(String[] args) {

		printGreetings("Greetings,Rumen");

	}

	private static void printGreetings(String... words) {
		for (String word : words) {
			System.out.print(word + " ");
		}

		System.out.println();

	}
}

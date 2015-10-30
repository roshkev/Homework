import java.util.Scanner;

public class work5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String str = "Hello";
		String str2 = input.nextLine();
		boolean result = str.equals(str2);
		System.out.println("The result is: " + result);
	}

}

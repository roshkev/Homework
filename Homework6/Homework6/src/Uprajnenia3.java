import java.util.Scanner;

public class Uprajnenia3 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int max = -2000;
		int min = 2000;
		for (int i = 1; i < 6; i++) {
			
		int m = a.nextInt();
		if (m > max) {
			max = m;

		}
		if (m < min) {
			min = m;
		}

	}

	}
}
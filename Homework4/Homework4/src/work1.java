import java.util.Scanner;

public class work1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Molia vavedete proizvolno tcislo");

		int n = scanner.nextInt();

		int counter = 1;
		
	    while (counter <= n) {
	    	
		 if ( counter % 3 == 2 && counter % 7 == 2 ) {
		
		
			System.out.println(counter);
		
		}
		counter++;
		
		}
		
	}

	
	}


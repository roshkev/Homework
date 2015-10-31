import java.util.Scanner;

public class Uprajnenia6 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner (System.in);
		
		int n = 100;
		
		for (int i = 1; i < n; i ++) {
			
		if(i % 3 != 0 && i % 7 !=0){
			System.out.println(i);
		}
		}

	}

}

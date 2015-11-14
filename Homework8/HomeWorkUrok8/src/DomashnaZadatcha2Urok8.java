
public class DomashnaZadatcha2Urok8 {

	public static long calcSum(int... elements) {
		long sum = 0;
		for (int element : elements) {
			sum += element * element;
		}
		return sum;
	}

	public static void main(String[] args) {

		long sum = calcSum(5, 5, 5);
		System.out.println(sum);

		long sum2 = calcSum(10, 10, 10, 10);
		System.out.println(sum2);

		long sum3 = calcSum(15, 15, 15);
		System.out.println(sum3);

		long sum4 = calcSum(1, 2, 3, 4, 5);
		System.out.println(sum4);

		long sum5 = calcSum(6, 7, 8);
		System.out.println(sum5);

		long sum6 = calcSum(5, 5, 5);
		System.out.println(sum6);

		long sum7 = calcSum(10, 10, 10, 10);
		System.out.println(sum7);

		long sum8 = calcSum(15, 15, 15);
		System.out.println(sum8);

		long sum9 = calcSum(1, 2, 3, 4, 5);
		System.out.println(sum9);

		long sum10 = calcSum(6, 7, 8);
		System.out.println(sum10);
	}
}

package practiceArray;

public class arrayAssignment {

	public static void main(String[] args) {
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[5];

		int num = 5;

		for (int i = 0; i < 5; i++) {
			a[i] = i;
		}
		for (int i = 0; i < 5; i++) {
			b[i] = num;
			++num;
		}
		System.out.println("Values of array 'A' :");
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println("Values of array 'B' :");
		for (int i = 0; i < 5; i++) {
			System.out.println(b[i] + " ");

		}
		for (int i = 0; i < 5; i++) {
			c[i] = a[i] + b[i];
		}
		System.out.println("Values of array 'C' :");
		for (int i = 0; i < 5; i++) {
			System.out.println(c[i] + " ");
		}

	}
}


public class Table {

	public static void main(String[] args) {
		int[] a = new int[] { 4, 7, 5, 9, 14, 22, 11, 16 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
		for (int j = 1; j <= 10; j++) {
			System.out.println(a[i] + "*" + j + "=" + a[i] * j);
		}

		if (a[i] % 2 == 0) {
			System.out.println(a[i] + " is even number");
			} else {
				System.out.println(a[i] + " is odd number");
				
			}
			
			temp = 0;
			for (int k = 2; k < a[i]; k++) {
				if (a[i] % k == 0) {
					temp = temp + 1;
					break;
				}
			}
			if (temp > 0) {
				System.out.println(a[i] + " is not prime number");
			} else {
				System.out.println(a[i] + " is prime number");
			}
			System.out.println();
		}
		}
}

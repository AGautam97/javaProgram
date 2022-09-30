package testOnline;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		int input;
		int x = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		input = s.nextInt();
		if (input > 0) {
			System.out.print("Input: " + input + " then output :" + x);
		}
		if (input % 2 == 1) {
			for (int i = 0; i < input - 1; i++) {
				x = x + 2;
				System.out.print(", " + x);
			}
		} else {
			for (int i = 0; i < input - 2; i++) {
				x = x + 2;
				System.out.print(", " + x);
			}
		}
	}
}

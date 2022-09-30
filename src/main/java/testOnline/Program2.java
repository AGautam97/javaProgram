package testOnline;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		int input;
		int x = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		input = s.nextInt();
		if (input > 0) {
			System.out.print("Input: " + input + " then output :" + x);
		}
		for (int i = 0; i < input - 1; i++) {
			x = x + 2;
			System.out.print(", " + x);
		}
	}
}

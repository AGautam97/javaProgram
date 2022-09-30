package testOnline;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		double a, b;
		double result = 0;
		String yes;
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter First number");
			a = s.nextDouble();
			System.out.println("Enter Second number");
			b = s.nextDouble();
			System.out.println("Choose any one Operation among --> +,-,*,/");
			String operation = s.next();

			switch (operation) {
			case "+":
				result = a + b;
				break;
			case "-":
				result = a - b;
				break;
			case "*":
				result = a * b;
				break;
			case "/":
				result = a / b;
				break;
			default:
				System.out.println("INVALID OPERATION");
				break;
			}
			System.out.println(result);
			System.out.println("Do You Want To Continue---Press y for YES and n for NO");
			yes = s.next();
		}
		while (yes.equals("Y") || yes.equals("y"));
	}
}

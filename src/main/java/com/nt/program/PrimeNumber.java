package com.nt.program;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num;
		int temp = 0;
		System.out.println("ENTER NUMBER:");
		
		Scanner s = new Scanner(System.in);
		num = s.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 0) {
			System.out.println(num + " :is not prime");
		} else {
			System.out.println(num + " :is prime");
		}
	}

}

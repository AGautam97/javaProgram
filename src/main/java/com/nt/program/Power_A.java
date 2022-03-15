package com.nt.program;

import java.util.Scanner;

public class Power_A {

	public static void main(String[] args) {
		int base;
		int power;

		System.out.println("ENTER NUMBER:");
		System.out.println("ENTER POWER:");

		Scanner s = new Scanner(System.in);
		base = s.nextInt();
		power = s.nextInt();
		int num = 1;
		
		for (int i = 1; i <= power; i++) {
			num*= base; 
		}
		System.out.println(num);
	}

}

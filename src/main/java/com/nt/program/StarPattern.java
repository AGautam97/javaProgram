package com.nt.program;

public class StarPattern {

	public static void main(String[] args) {
		int a = 7;
		for (int i = 0; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if (j == 1 || j == a || i == a / 2) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			for(int s=1;s<=a;s++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= a; k++) {
				if (k == 1 || i == 0 || i == a / 2 || i == a) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			for(int s=1;s<=a;s++) {
				System.out.print(" ");
			}
			for (int l = 1; l <= a; l++) {
				if (l == 1 || i == a) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			for(int s=1;s<=a;s++) {
				System.out.print(" ");
			}
			for (int l = 1; l <= a; l++) {
				if (l == 1 || i == a) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}for(int s=1;s<=a;s++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= a; m++) {
				if (m == 1 || m == a || i == 0 || i == a) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}

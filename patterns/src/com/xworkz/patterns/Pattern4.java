package com.xworkz.patterns;

public class Pattern4 {

	public static void main(String[] args) {
		int n = 4;
		for (int i = n; i >= 0; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

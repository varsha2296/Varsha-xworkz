package com.xworkz.patterns;

public class Pattern5 {

	public static void main(String[] args) {
		int n = 2;
		for (int i = n; i >= -n; i--) {
			for (int j = n; j >= Math.abs(i); j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

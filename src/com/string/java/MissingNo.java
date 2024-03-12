package com.string.java;

public class MissingNo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 8 };

		int actualSum = 0;
		int n = 8;
		int sum = n / 2 * (n + 1);
		for (int a : arr) {

			actualSum = actualSum + a;
		}
		System.out.println("missing no : " + (sum - actualSum));
	}

}

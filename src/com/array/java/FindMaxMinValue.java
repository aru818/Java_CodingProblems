package com.array.java;

public class FindMaxMinValue {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9, 9 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println(max + "    " + min);
		for (int i = 0; i < arr.length; i++) {

			int n = arr[i];

			if (n > max) {
				max = n;
			}  if (n < min) {
				min=n;
			}

		}
		System.out.println("max for the list is " + max + " and min for the list is " + min);
	}
}

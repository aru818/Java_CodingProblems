package com.array.java;

public class InsertElement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 4, 8, 9, 6 };
		for (int i = arr.length - 1; i > 2; i--) {
			arr[i] = arr[i - 1];
		}
		arr[3] = 49;
		for (int a : arr) {
			System.out.println(a);
		}

	}
}

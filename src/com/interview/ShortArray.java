package com.interview;

public class ShortArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 2, 1 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}

			}

		}
		for (int a : arr) {

			System.out.println(a);
		}

	}
}

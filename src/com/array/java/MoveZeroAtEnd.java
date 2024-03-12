package com.array.java;

public class MoveZeroAtEnd {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 7, 4, 0, 5, 0, 6, 0 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] != 0)) {
				arr[count] = arr[i];
				count++;

			}

		}
		while (count < arr.length) {
			arr[count] = 0;
			count++;
		}

		for (int a : arr) {
			System.out.println(a);
		}
		;
	}
}

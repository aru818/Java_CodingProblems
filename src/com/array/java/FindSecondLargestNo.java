package com.array.java;

import java.util.Arrays;

public class FindSecondLargestNo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 2, 6, 9, 9 };
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			if ((arr[i] > arr[i - 1])) {
				System.out.println(arr[i - 1]);
				break;
			}
		}

	}
}

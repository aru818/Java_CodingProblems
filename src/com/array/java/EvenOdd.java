package com.array.java;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 8, 9, 7, 8 };
		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			if (arr[i] % 2 == 0) {
				evenList.add(n);
			} else {
				oddList.add(n);
			}

		}
		System.out.println(evenList);
		System.out.println(oddList);
	}
}

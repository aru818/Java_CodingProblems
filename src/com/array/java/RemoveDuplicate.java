package com.array.java;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		int[] arr = { 2, 3, 5, 2, 6, 9 };
		
		for (int a : arr) {
			set.add(a);

		}
		for (int a : set) {
			System.out.println(a);

		}
		;
	}

}

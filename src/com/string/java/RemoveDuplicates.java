package com.string.java;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String str = "arvindkumar";
		StringBuilder strbld = new StringBuilder();
		Set<Character> set = new HashSet<>();
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (!set.contains(c)) {
				set.add(c);
				strbld.append(c);
			}

		}

		String string = strbld.toString();

		System.out.println(string);

	}
}

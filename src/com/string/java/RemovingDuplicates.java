package com.string.java;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class RemovingDuplicates {
	public static void main(String[] args) {
		String str = "arvinfnfnfnfn";
		char[] arr = str.toCharArray();
		StringBuilder newString = new StringBuilder();
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (!set.contains(c)) {
				newString.append(c);
				set.add(c);
			}

		}
		System.out.println(newString.toString());
		
		for(char c: set) {
			System.out.print(c);
		}
	}

}

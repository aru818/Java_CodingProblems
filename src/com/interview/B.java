package com.interview;

import java.util.HashSet;
import java.util.Set;

public class B {
	
	public static void main(String[] args) {
		String input = "abababab";
		
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < input.length(); i++) {

			for (int j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					char c = input.charAt(i);
					set.add(c);
					break;
				}

			}
		}
		for (char ch : set) {
			System.out.println(ch);
		}
	}
}

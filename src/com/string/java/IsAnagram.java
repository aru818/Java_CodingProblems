package com.string.java;

public class IsAnagram {
	public static void main(String[] args) {
		boolean isAnagram = isAnagram("asrvind", "dnivar");
		System.out.println(isAnagram);
	}

	public static boolean isAnagram(String s1, String s2) {
		char[] arr = s1.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (s2.contains(Character.toString(c)) && s1.length() == s2.length()) {
				return true;
			}

		}

		return false;
	}
}

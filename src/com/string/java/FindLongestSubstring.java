package com.string.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindLongestSubstring {
	public static void main(String[] args) {
		String string = "bcdefdgha";
		int maxLength = 0;
		String longestSubstring = "";
		Map<Character, Integer> map = new LinkedHashMap<>();
		/* char[] arr = string.toCharArray(); */
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, i);
			} else {
				i = map.get(c);
				map.clear();
			}

		}

		if (map.size() > maxLength) {

			maxLength = map.size();
			longestSubstring = map.keySet().toString();
			System.out.println("max substring is " + longestSubstring + "with length of " + maxLength);

		}
		/*
		 * for (Map.Entry<Character, Integer> mapp : map.entrySet()) { Character key =
		 * mapp.getKey(); System.out.println(key); }
		 */
	}

}

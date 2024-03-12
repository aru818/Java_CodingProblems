package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class A {
	public static void main(String[] args) {
		String input = "abababab";
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			if (map.containsKey(c)) {
			int	count = map.get(c);
				map.put(c, count+1);

			} else {
				map.put(c, 1);
			}

		}
		for (Entry<Character, Integer> myMap : map.entrySet()) {
			Character key = myMap.getKey();
			Integer value = myMap.getValue();

			if (value >1) {

				System.out.println(key);
			}

		}
	}
}

package com.string.java;
import java.util.ArrayList;
import java.util.List;

public class ReplaceCharAtOccur {
	public static void main(String[] args) {
		String str = "arvindd";
		char[] arr = str.toCharArray();
		List<Character> list = new ArrayList<>();
		char target = 'a';
		char replaced = 'm';
		for (char c : arr) {
			list.add(c);
		}
		for (int i = 0; i < arr.length; i++) {
			if (list.get(i) == target) {
				list.set(i, replaced);
			}
		}

		
			System.out.println(list);
		}
	}


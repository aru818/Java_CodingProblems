package com.string.java;

public class FirstNonRepCharacter {
	public static void main(String[] args) {
		String str = "AABBVVHHCDE";

		for (int i = 0; i < str.length(); i++) {
			boolean status = true;
			// remember i and j is value of index 
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					status = false;

					break;

				}

			}
			if (status==true) {

				System.out.println(str.charAt(i));
				break;
			}

		}
	}
}

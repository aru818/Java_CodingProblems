package com.string.java;

public class ReverseString {
	public static void main(String[] args) {

		String str = "sumit";
		char[] charArray = str.toLowerCase().toCharArray();
		int right = charArray.length-1 ;
		int left = 0;
		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}

		String modifiedStr = new String(charArray);
		System.out.println(modifiedStr);

		for (char c : charArray) {

			System.out.print(c);
		}

	}

}

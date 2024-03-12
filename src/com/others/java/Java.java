package com.others.java;

public class Java {
	public static void main(String[] args) {

		{
			String str = "AABBCCDDHJ";
			for (int i = 0; i < str.length(); i++) {
				boolean status = true;
				for (int j = 0; j < str.length(); j++) {
					if (i != j && str.charAt(i) == str.charAt(j)) {

						status = false;
						break;

					}

				}
				if (status) {

					System.out.println(str.charAt(i));
					break;
				}

			}

		}

	}
}

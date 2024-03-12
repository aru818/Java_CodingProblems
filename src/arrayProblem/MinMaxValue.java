package arrayProblem;

import java.util.Arrays;

public class MinMaxValue {
	public static void main(String[] args) {

		int[] arr = { 5, 4, 8, 7, 9, 1, 9 };
		int max = arr[0];
		int min = arr[0];
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];
			} 
			if (arr[i] < min) {
				min = arr[i];

			}

		}
		System.out.println(" The min value is: " + min);
		System.out.println(" The max value is: " + max);
	}
}

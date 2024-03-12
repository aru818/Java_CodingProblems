package com.array.java;

public class SortZeroesAndOnes {
	 public static void sortArray(int[] arr) {
	        int countZeroes = 0;

	        // Count the number of zeroes
	        for (int num : arr) {
	            if (num == 0) {
	                countZeroes++;
	            }
	        }

	        // Fill the array with zeroes
	        for (int i = 0; i < countZeroes; i++) {
	            arr[i] = 0;
	        }

	        // Fill the remaining array with ones
	        for (int i = countZeroes; i < arr.length; i++) {
	            arr[i] = 1;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1};
	        sortArray(arr);
	        System.out.println("Sorted Array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
}

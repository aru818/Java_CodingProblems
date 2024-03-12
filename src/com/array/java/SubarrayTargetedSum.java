package com.array.java;

import java.util.ArrayList;
import java.util.List;

public class SubarrayTargetedSum {
	

	public static List<List<Integer>> findSubarraysWithSum(int[] arr, int targetSum) {

		List<List<Integer>> list = new ArrayList<>();
		int start = 0;
		int end = 0; 
		int currentSum = 0;
		while (end < arr.length) {
			currentSum = currentSum + arr[end];

			while (currentSum > targetSum) {
				currentSum = currentSum - arr[start];
				start++;
				if (currentSum == targetSum) 	{
					List<Integer> subArray = new ArrayList<>();
					for (int i = start; i <= end; i++) {

						subArray.add(arr[i]);
					}
					list.add(subArray);

					currentSum = currentSum - arr[start];
					start++;
				}

				
			}
			end++;
		}
		return list;

	}
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int targetSum = 9;

		List<List<Integer>> subarrays = findSubarraysWithSum(arr, targetSum);
		for (List<Integer> subarray : subarrays) {
			System.out.println(subarray);
		}

	}
}

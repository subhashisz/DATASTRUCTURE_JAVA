package com.myapp.array_practices;

public class RotateArrayLeetCode {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int rotate = 3;
		rotate(arr, rotate);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/*
	 * Rotate an array of n elements to the right by k steps. For example, with n =
	 * 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. How
	 * many different ways do you know to solve this problem?
	 */

	// SOLUTION 1
	public static void rotate(int[] nums, int k) {
		if (k > nums.length)
			k = k % nums.length;
		int[] result = new int[nums.length];
		for (int i = 0; i < k; i++) {
			result[i] = nums[nums.length - k + i];
		}
		int j = 0;
		for (int i = k; i < nums.length; i++) {
			result[i] = nums[j];
			j++;
		}
		System.arraycopy(result, 0, nums, 0, nums.length);
	}

	// SOLUTION 2
	public static void rotate1(int[] arr, int order) {
		if (arr == null || order < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
		for (int i = 0; i < order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
	}

	// SOLUTION 3

	public static void rotate2(int[] arr, int order) {
		order = order % arr.length;
		if (arr == null || order < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
		// length of first part
		int a = arr.length - order;
		reverse(arr, 0, a - 1);
		reverse(arr, a, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
	}

	public static void reverse(int[] arr, int left, int right) {
		if (arr == null || arr.length == 1)
			return;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

}

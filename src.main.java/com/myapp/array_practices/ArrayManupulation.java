package com.myapp.array_practices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayManupulation {

	// Define a static logger variable so that it references the
	// Logger instance named "MyApp".
	private static final Logger LOGGER = LogManager.getLogger(ArrayManupulation.class.getName());

	public static void main(String[] args) {
		LOGGER.info("Entering application. ArrayManupulation main method...........");
		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = { 70, 80, 10, 30, 60, 50, 30, 30 };

		int[] duplicateElement1 = { 10, 20, 30, 30, 50, 60, 12, 23, 45, 45 };
		int[] duplicateElement2 = { 70, 80, 10, 30, 60, 50, 30, 30 };

		// System.out.println(removeElementFromArray(arr2, 30));
//		int []arr3=mergeTwoArray(arr1, arr2);
//        for(int i=0;i<arr3.length;i++) {
//        	System.out.println(arr3[i]);
//        }
//		int[] tempSorted = findDuplicateElementSortedArray(duplicateElement1);
//		for (int i = 0; i < tempSorted.length; i++) {
//			System.out.println(tempSorted[i]);
//		}

		int[] tempUnSorted = findDuplicateElementUnSortedArray(duplicateElement2);
		for (int i = 0; i < tempUnSorted.length; i++) {
			System.out.println(tempUnSorted[i]);
		}
		LOGGER.info("Exiting application.ArrayManupulation main method...............");
	}

	public static int[] mergeTwoArray(int[] arr1, int[] arr2) {
		int finalLength = arr1.length + arr2.length;
		int[] arr3 = new int[finalLength];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[(arr1.length) + i] = arr2[i];
		}
		return arr3;
	}

	public static int[] insertElementToArray(int[] arr, int element, int position) {
		boolean flag = Boolean.FALSE;
		for (int i = arr.length - 1; i < position - 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[position - 1] = element;
		return arr;
	}

	public static boolean removeElementFromArray(int[] arr, int element) {
		boolean flag = Boolean.FALSE;
		for (int i = 0; i < arr.length; i++) {
			if (element == arr[i]) {
				flag = Boolean.TRUE;
				for (int j = i; j < arr.length; j++) {
					arr[i] = arr[i + 1];
				}
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return flag;
	}

	public static int[] findDuplicateElementSortedArray(int[] arr) {
		int[] duplicateElements = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				duplicateElements[j] = arr[i];
				j++;
			}
		}
		duplicateElements[j] = arr[arr.length - 1];

		return duplicateElements;
	}

	public static int[] findDuplicateElementUnSortedArray(int[] arr) {
		int[] duplicateElements = new int[arr.length];

		return duplicateElements;
	}

	public static int[] removeDuplicateElementSortedArray(int[] arr) {
		int[] finalElements = new int[arr.length];

		return finalElements;
	}

	public static int[] removeDuplicateElementUnSortedArray(int[] arr) {
		int[] finalElements = new int[arr.length];

		return finalElements;
	}

}

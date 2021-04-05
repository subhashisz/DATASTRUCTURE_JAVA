package com.myapp.array_practices;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author SUBHASHIS
 */
public class ArrayManupulation {

	// Define a static logger variable so that it references the
	// Logger instance named "MyApp".
	private static final Logger LOGGER = LogManager.getLogger(ArrayManupulation.class.getName());

	public static void main(String[] args) {
		// LOGGER.info("Entering application. ArrayManupulation main
		// method...........");
		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = { 70, 80, 10, 30, 60, 50, 30, 30 };

		for (Integer nos : commonElementsInTwoArraysForLoop(arr1, arr2)) {
			System.out.print(nos + " ");
		}

		// LOGGER.info("Exiting application.ArrayManupulation main
		// method...............");
	}

	public static List<Integer> commonElementsInTwoArraysForLoop(int[] arr1, int[] arr2) {
		List<Integer> tempList = new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					tempList.add(arr1[i]);
					break;
				}
			}
		}

		return tempList;

	}

	public static List<Integer> commonElementsInTwoArraysHashMap(int[] arr1, int[] arr2) {
		List<Integer> tempList = new ArrayList<Integer>();

		return tempList;

	}

	/*
	 * complete
	 */
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

	/*
	 * complete
	 */
	public static int[] insertElementToArray(int[] arr, int element, int position) {
		for (int i = arr.length - 1; i < position - 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[position - 1] = element;
		return arr;
	}

	/*
	 * complete
	 */
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

	/*
	 * complete
	 */
	public static int[] removeDuplicateElementSortedArray(int[] arr) {
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

	/*
	 * incomplete
	 */
	public static int[] removeDuplicateElementUnSortedArray(int[] arr) {
		int[] duplicateElements = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int k = 1; k < arr.length; k++)
				if (arr[i] != arr[k])
					;
			duplicateElements[j] = arr[i];
			j++;
		}
		duplicateElements[j] = arr[arr.length - 1];
		return duplicateElements;

	}

	public static int[] findDuplicateElementSortedArray(int[] arr) {
		int[] finalElements = new int[arr.length];

		return finalElements;
	}

	public static int[] findDuplicateElementUnSortedArray(int[] arr) {
		int[] finalElements = new int[arr.length];

		return finalElements;
	}

}

package com.myapp.ds_al;

public class Factorial {

	public static int getFactorialOfTheGivenNumber(int num) {
		int fact = 1;
		if (num == 0) {
			return 1;
		} else {
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
		}
		return fact;
	}

	/*
	 * Using recursion
	 */
	public static int factorialUsingRecursion(int num) {
		if (num == 0)
			return 1;
		else
			return (num * factorialUsingRecursion(num - 1));
	}

}

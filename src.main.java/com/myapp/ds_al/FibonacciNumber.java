package com.myapp.ds_al;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {
	int n1 = 0, n2 = 1, n3 = 0;
	List<Integer> fibonacciList = new ArrayList<Integer>();

	public List<Integer> getFibonacciInTheRangeOf(int range) {
		if (range > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			fibonacciList.add(n3);
			getFibonacciInTheRangeOf(range - 1);
		}
		return fibonacciList;
	}

	// A utility method that returns true if x is perfect square
	static boolean isPerfectSquare(int x) {
		int s = (int) Math.sqrt(x);
		return (s * s == x);
	}

	// Returns true if n is a Fibonacci Number, else false
	public static boolean isFibonacci(int number) {
		// n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
		// is a perfect square
		return isPerfectSquare(5 * number * number + 4) || isPerfectSquare(5 * number * number - 4);

	}

}

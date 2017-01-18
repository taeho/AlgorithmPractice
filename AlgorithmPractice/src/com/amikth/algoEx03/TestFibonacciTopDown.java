package com.amikth.algoEx03;

public class TestFibonacciTopDown {
	public static int memo[] = new int[100];

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			if (memo[n] > 0) {
				return memo[n];
			}
			memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
			return memo[n];
		}
	}

	public static void main(String[] args) {
		int input = 6;
		System.out.println(fibonacci(input));
	}
}

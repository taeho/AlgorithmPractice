package com.amikth.algoEx03;

public class TestFibonacciButtomUp {
	public static int memo[] = new int[100];

	public static int fibonacci(int n) {

		memo[0] = 0;
		memo[1] = 1;

		for (int i = 2; i <= n; i++) {
			memo[i] = memo[i - 1] + memo[i - 2];
		}

		return memo[n];

	}

	public static void main(String[] args) {
		int input = 6;
		System.out.println(fibonacci(input));
	}
}

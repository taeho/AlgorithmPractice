package com.amikth.algoEx02.temp;

import java.util.Scanner;

/*
 * 1~100000 사이의 모든 소수를 찾아서 출력
 *  
 * */

public class TestCheckPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PrintIsPrime(n);
	}
	
	public static void PrintIsPrime(int n) {
		int limits = n;
		
		for (int i = 2; i <= limits; i++) {
			boolean isPrime = true;
			for (int j = 2; j * j <= i && isPrime; j++) {
				if (j % i == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}
}

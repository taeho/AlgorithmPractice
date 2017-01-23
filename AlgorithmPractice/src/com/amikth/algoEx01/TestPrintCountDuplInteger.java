package com.amikth.algoEx01;

import java.util.Scanner;

/*
 * 문제: 사용자로부터 먼저 정수의 개수 n을 입력받는다.
 * 이어서 n개의 정수를 입력받아 순서대로 배열에 저장한다.
 * 그런 다음 중복된 정수 쌍의 개수를 카운트하여 출력하라.
 * 예를 들어서 n=6 이고 입력된 정수들이 2, 3, 2, 4, 5, 2 이면
 * 중복된 정수쌍은 (2,2) , (2,2), (2,2), (4,4)
 * 으로 총 4쌍이다.
 * 
 * */

public class TestPrintCountDuplInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
		}
		System.out.println("count = " + count);
	}

}

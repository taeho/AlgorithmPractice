package com.amikth.algoEx01;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2441
 * 문제 : 별찍기 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 *       하지만, 오른쪽을 기준으로 정렬한 별 (예제 참고)을 출력하시오.
 * 입력 : 첫째 줄에 N (1<=N<=100)이 주어진다.
 * 출력 : 첫째 줄부터 N번째 줄 까지 차례대로 별을 출력한다..
 * 예제 입력: 5
 * 예제 출력:
 *     *****
 *      ****
 *       ***
 *        **
 *         *
 * */

public class Star4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = a;

		for (int i = 0; i < d; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int n = d; n - i > 0; n--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}

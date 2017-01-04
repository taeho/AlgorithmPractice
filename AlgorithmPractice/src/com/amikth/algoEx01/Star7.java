package com.amikth.algoEx01;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2445
 * 문제 : 별찍기 -  
 * 입력 : 첫째 줄에 N (1<=N<=100)이 주어진다.
 * 출력 : 첫째 줄부터 2*N-1번째 줄 까지 차례대로 별을 출력한다.
 * 예제 입력: 5
 * 예제 출력:
 * 
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*        
 * */

public class Star7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = a;

		for (int i = 0; i < d; i++) {
			for (int n = 0; n < i + 1; n++) {
				System.out.print("*");
			}
			for (int j = d - i; j > 1; j--) {
				System.out.print("  ");
			} 
			for (int n = 0; n < i + 1; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < d; i++) {
			for (int j = d - i; j > 1; j--) {
				System.out.print("*");
			}
			for (int n = 0; n < i + 1; n++) {
				System.out.print("  ");
			} 
			for (int j = d - i; j > 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

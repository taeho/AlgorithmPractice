package com.amikth.algoEx01;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2442
 * 문제 : 별찍기 - 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2*N-1개를 찍는 문제
 *       별은 가운데를 기준으로 대칭이어야 한다.
 * 입력 : 첫째 줄에 N (1<=N<=100)이 주어진다.
 * 출력 : 첫째 줄부터 N번째 줄 까지 차례대로 별을 출력한다..
 * 예제 입력: 5
 * 예제 출력:
 *      *
 *     ***
 *    *****
 *   *******
 *  *********
 * */

public class Star5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();		
		int d = a;
		
		for(int i=0; i< d; i++) {
			for(int j = d-i; j > 1; j--) {
				System.out.print(" ");
			}
			for(int n =0; n < i+1; n++) {
				System.out.print("*");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

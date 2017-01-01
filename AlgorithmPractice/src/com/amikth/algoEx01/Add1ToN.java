package com.amikth.algoEx01;

import java.util.Scanner;


/*
 *  https://www.acmicpc.net/problem/8393
 *  문제 : 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 *  입력 : 3
 *  출력 : 6
 * */


public class Add1ToN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int res = 0;
		for(int i=1; i<=a; i++) {
			res += i;
		}
		System.out.println(res);
	}
}

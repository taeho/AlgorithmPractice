package com.amikth.algoEx03.DP;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/11727
 * 
 * 문제
 * 2×n 직사각형을 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오..
 * 아래 그림은 2×17 직사각형을 채운 한가지 예이다.
 * 
 * 입력
 * 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
 * 
 * 
 * 출력
 * 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 * 
 * 예제입력: 2
 * 예제출력: 3
 * 
 * 예제입력: 8
 * 예제출력: 171
 * 
 * 예제입력: 12
 * 예제출력: 2731
 *  
 * */
public class Test2NTiling2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[1001];
		arr[0] = 1;
		arr[1] = 1;
		for(int i=2; i <= n; i++) {
			arr[i] = arr[i-1] + (arr[i-2]*2);
			arr[i] %= 10007;
		}
		
		System.out.println(arr[n]);
	}

}

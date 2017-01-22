package com.amikth.algoEx03.DP;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/9095
 * 
 * 문제
 * 정수 4를 1, 2, 3의 조합으로 나타내는 방법은 총 7가지가 있다.
 * •1+1+1+1
 * •1+1+2
 * •1+2+1
 * •2+1+1
 * •2+2
 * •1+3
 * •3+1
 * 정수 n이 주어졌을 때, n을 1,2,3의 합으로 나타내는 
 * 방법의 수를 구하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫쨰 줄에 테스트 케이스의 개수 T가 주어진다. 
 * 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. 
 * 
 * 
 * 출력
 * 각 테스트 케이스마다, n을 1,2,3의 합으로 나타내는 방법의 수를 출력한다.
 * 
 * 예제입력: 
 * 3
 * 4
 * 7
 * 10
 * 
 * 예제출력: 
 * 7
 * 44
 * 274
 *  
 * */
public class TestOneTwoThreeSum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[11];
		
		arr[0] = 1;
		
		for(int i=1; i <= 10; i++) {
			for(int j=1; j<=3; j++ ) {
				if(i-j >= 0) {
					arr[i] += arr[i-j];
				}
			}
		}
		int t=  sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			System.out.println(arr[n]);
		}
		
		
		
	}

}

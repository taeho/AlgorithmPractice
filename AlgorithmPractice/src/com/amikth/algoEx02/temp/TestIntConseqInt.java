package com.amikth.algoEx02.temp;

import java.util.Scanner;

/*
 * 문제:
 * n개의 정수를 입력 받아 배열에 저장한다.
 * 이들 중에서 0개의 이상의 연속된 정수들을 더하여 얻을 수 있는
 * 최대 값을 구하여 출력하는 프로그램을 작성하라.
 * 
 * 예제입력
 * 총개수 : 13
 * 입력값 : -2, 3, 5, -14, 12, 3, -9, 8, -1, 13, 2, -5, 4
 * 
 * 예제출력
 * 28
 * */

public class TestIntConseqInt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		for(int i=0; i<n; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		
		int maxSum = 0;
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				int sum=0;
				for(int k=i; k<=j; k++){
					sum += data[k];
				}
				if(sum > maxSum) {
					maxSum = sum;
				}
			}
		}
		System.out.println("The max Sum is = " + maxSum);
	}

}

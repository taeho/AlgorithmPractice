package com.amikth.algoEx02.temp;

import java.util.Scanner;

/*
 * 문제 '
 * n개의 정수를 입력받아 순서대로 배열에 저장한다.
 * 그 런다음...모든 정수르 한 칸씩 오른쪽으로 shift 하자.
 * 마지막 정수는 배열의 첫 칸으로 이동한다.
 * 
 * 예제 입력:
 * 8 4 1 7 11 13 5 2
 * 
 * 예제 출력:
 * 2 8 4 1 7 11 13 5
 * */

public class TestLastShiftToFirst {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int[] data = new int[n];
		for(int i=0; i<n; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		
		int tmp = data[n-1];
		for(int i=n-2; i>=0; i--) {
			data[i+1] = data[i];
			
		}
		data[0] = tmp;
		
		for(int i=0; i<n; i++) {
			System.out.println(data[i]);
		}
		
	}
}

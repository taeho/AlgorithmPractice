package com.amikth.algoEx01;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2438
 * ���� : ����� 1 - ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
 * �Է� : ù° �ٿ� N (1<=N<=100)�� �־�����.
 * ��� : ù° �ٺ��� N��° �� ���� ���ʴ�� ���� ����Ѵ�.
 * ���� �Է�: 5
 * ���� ���:
 *       *
 *       **
 *       ***
 *       ****
 *       *****
 * */

public class Star1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0 ; i<a; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

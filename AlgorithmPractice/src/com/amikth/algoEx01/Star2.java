package com.amikth.algoEx01;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2439
 * ���� : ����� 2 - ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
 *       ������, �������� �������� ������ �� (���� ����)�� ����Ͻÿ�.
 * �Է� : ù° �ٿ� N (1<=N<=100)�� �־�����.
 * ��� : ù° �ٺ��� N��° �� ���� ���ʴ�� ���� ����Ѵ�.
 * ���� �Է�: 5
 * ���� ���:
 *           *
 *          **
 *         ***
 *        ****
 *       *****
 * */

public class Star2 {
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
			System.out.println();
		}
	}
}

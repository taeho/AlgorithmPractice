package com.amikth.algoEx01;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2742
 * ����: �ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�: ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.
 * ���: ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.
 * 
 * */
public class PrintNTo1 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		do {
			System.out.println(a);
			--a;
		} while (a > 0);
	}
}

package com.amikth.algoEx01;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2741
 * ����: �ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�: ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.
 * ���: ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.
 * 
 * */
public class Print1ToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1; i<=a; i++) {
			System.out.println(i);
		}
	}

}

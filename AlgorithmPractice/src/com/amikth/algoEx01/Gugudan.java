package com.amikth.algoEx01;

import java.util.Scanner;


/*
 * https://www.acmicpc.net/problem/2739
 * ���� : N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
 * �Է� : ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.		��, 2
 * ��� : ������İ� ���� N*1���� N*9���� ����Ѵ�.
 * 2 * 1 = 2
 * 2 * 2 = 4
 * 2 * 3 = 6
 * 2 * 4 = 8
 * 2 * 5 = 10
 * 2 * 6 = 12
 * 2 * 7 = 14
 * 2 * 8 = 16
 * 2 * 9 = 18
 * 
 * */
public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(a + " * " + i + " = " + a*i);
		}
	}
}

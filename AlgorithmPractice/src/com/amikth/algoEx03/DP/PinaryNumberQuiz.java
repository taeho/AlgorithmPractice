package com.amikth.algoEx03.DP;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2193
 * 0�� 1�θ� �̷���� ���� �������� �Ѵ�.
 * �̷��� ������ �� Ư���� ������ ���� �͵��� �ִµ�, 
 * �̵��� ��ģ��(pinary number)�� �Ѵ�. ��ģ���� ������ ������ �����Ѵ�.
 * 
 * 1.��ģ���� 0���� �������� �ʴ´�.
 * 2.��ģ�������� 1�� �� �� �������� ��Ÿ���� �ʴ´�. ��, 11�� �κ� ���ڿ��� ���� �ʴ´�.
 * 
 * ���� ��� 1, 10, 100, 101, 1000, 1001 ���� ��ģ���� �ȴ�.
 * ������ 0010101�̳� 101101�� ���� 1, 2�� ��Ģ�� ����ǹǷ� ��ģ���� �ƴϴ�.
 * 
 * N(1��N��90)�� �־����� ��, N�ڸ� ��ģ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է� 
 * ù° �ٿ� N�� �־�����.
 * 
 * ���
 * ù° �ٿ� N�ڸ� ��ģ���� ������ ����Ѵ�.
 * 
 * ���� �Է�
 * 3
 * 
 * ���� ���
 * 2
 * 
 * */
public class PinaryNumberQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		// LinkedList arr = new LinkedList();
		// for (int i = 1; i <= n; i++) {
		// String IntBinary = Long.toBinaryString(i);
		// System.out.println(IntBinary);
		// arr.add(IntBinary);
		// }

		// for (int i = 0; i < arr.size(); i++) {
		// String temp = arr.get(i).toString();
		// int tmp = temp.length();
		// for (int j = 0; j < tmp; j++) {
		// int a = temp.charAt(j);
		// if (j == 0 & a != 0) {
		// res++;
		// }
		// if (j > 0 && j < tmp) {
		// int b = temp.charAt(j - 1);
		// if (a != 1 && b != 1) {
		// res++;
		// }
		// }
		// }
		// }
		//System.out.println(res);
		long[] d = new long[n + 1];
		d[1] = 1;
		if (n >= 2) {
			d[2] = 1;
		}
		for (int i = 3; i <= n; i++) {
			d[i] = d[i - 1] + d[i - 2];
		}
		System.out.println(d[n]);

		

	}

}

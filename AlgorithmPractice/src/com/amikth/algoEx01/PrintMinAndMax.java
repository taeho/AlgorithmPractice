package com.amikth.algoEx01;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10818
 * ���� : N���� ������ �־�����. 
 *       �� ��, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է� : ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. 
 *      ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. 
 *      ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
 * ��� : ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
 * ���� : 5
 *      20 10 35 30 7
 *      
 * */

public class PrintMinAndMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int min = 0;
		int max = 0;
		while(a-- > 0){
			int in = sc.nextInt();
			if(in > max) {
				max = in;
			} 
			if (in < min) {
				min = in;
			}
		}
		System.out.println(min + " " + max);
	}
}

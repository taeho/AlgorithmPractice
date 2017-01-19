package com.amikth.algoEx03;

import java.util.Scanner;


/*
 * https://www.acmicpc.net/problem/1463
 * 
 * ���� X�� ����� �� �ִ� ������ ������ ���� �� ���� �̴�.
 * 1.X�� 3���� ������ ��������, 3���� ������.
 * 2.X�� 2�� ������ ��������, 2�� ������.
 * 3.1�� ����. 
 * 
 * ���� N�� �־����� ��, ���� ���� ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�. 
 * ������ ����ϴ� Ƚ���� �ּҰ��� ����Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� 1���� ũ�ų� ����, 10(6��)���� �۰ų� ���� �ڿ��� N�� �־�����.
 * ���
 * ù° �ٿ� ������ �ϴ� Ƚ���� �ּҰ��� ����Ѵ�.
 * 
 * ���� �Է�: 2
 * ���� ���: 1
 * 
 * ���� �Է�: 10
 * ���� ���: 3
 * 
 * ��Ʈ: 10�� ��쿡 10 -> 9 -> 3 -> 1 �� 3�� ���� ���� �� �ִ�.
 * 
 * */


public class TestDynamicMakeOneTopDown {
	
	public static int[] d;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		d = new int[n+1];
		System.out.println(RtnCntMakeOne(n));
		
	} 
	
	public static int RtnCntMakeOne(int n) {
		
		if(n==1) {
			return 0;
		}
		if(d[n] > 0 ) {
			return d[n];
		}
		
		d[n] = RtnCntMakeOne(n-1) +1;
		if(n%2==0) {
			int temp = RtnCntMakeOne(n/2)+ 1;
			if(d[n] > temp) {
				d[n] = temp;
			}
		}
		
		if(n%3==0) {
			int temp = RtnCntMakeOne(n/3) + 1;
			if(d[n] > temp) {
				d[n] = temp;
			}
		}
		
		return d[n];
	}

}

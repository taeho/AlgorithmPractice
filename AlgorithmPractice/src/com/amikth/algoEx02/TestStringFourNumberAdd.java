package com.amikth.algoEx02;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10824
 * 
 * �� �ڿ��� A, B, C, D�� �־�����.
 *  �� ��, A�� B�� ���� ���� C�� D�� ���� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
 *  �� ���� A�� B�� ��ġ�� ���� A�� �ڿ� B�� ���̴� ���� �ǹ��Ѵ�. 
 *  ��, 20�� 30�� ���̸� 2030�� �ȴ�.
 * 
 * �Է�
 * ù° �ٿ� �� �ڿ��� A, B, C, D�� �־�����. (1 �� A, B, C, D �� 1,000,000)
 * 
 * ���
 * A�� B�� ���� ���� C�� D�� ���� ���� ���� ����Ѵ�.
 * 
 * ���� �Է�
 * 10 20 30 40
 * 
 * ���� ���
 * 4060
 * 
 * */

public class TestStringFourNumberAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		String ab = (String.valueOf(a) + String.valueOf(b));
		String cd = (String.valueOf(c) + String.valueOf(d));
		
		System.out.println(Integer.parseInt(ab)+ Integer.parseInt(cd));
		
		
	}
}

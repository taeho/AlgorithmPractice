package com.amikth.algoEx02;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10808
 * 
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. 
 * �� ��, �� ���ĺ��� �ܾ �� ���� ���ԵǾ� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
 * 
 * �Է�
 * ù° �ٿ� �ܾ� S�� �־�����. 
 * �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
 * 
 * ���
 * �ܾ ���ԵǾ� �ִ� a�� ����, b�� ����, ��, z�� ������ �������� �����ؼ� ����Ѵ�.
 * 
 * ���� �Է�
 * baekjoon
 * 
 * ���� ���
 * 1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0
 * 
 * */

public class TestStringCntAlpahbet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] cnt = new int[26];
		
		for(int i=0; i < s.length(); i++ ) {
			int tmp = (int)s.charAt(i);
			cnt[tmp- 97] += 1;
			
		}
		for (int i=0; i<26; i++) { 
			System.out.print(cnt[i] + " "); 
		} 

		int a = 'a';	// 97 
		int b = 'b';	// 98
		
		
	}
}

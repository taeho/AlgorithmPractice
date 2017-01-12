package com.amikth.algoEx02;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10809
 * 
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. 
 * ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
 * ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� �ܾ� S�� �־�����. 
 * �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
 * 
 * ���
 * ������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ,
 * b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ� ����Ѵ�.
 * ����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ����Ѵ�. 
 * �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �� ��° ���ڴ� 1��° ��ġ�̴�.
 * 
 * ���� �Է�
 * baekjoon
 * 
 * ���� ���
 * 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
 * 
 * */

public class TestStringFindAlpahbet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] cnt = new int[26];
		//int val = 0;
		
		for (int i=0; i<26; i++) { 
			cnt[i] = -1;
		}
		
		for(int i=0; i < s.length(); i++ ) {
			int tmp = (int)s.charAt(i);
			if (cnt[tmp-97] == -1) { 
				cnt[tmp-97] = i; 
			} 

			//cnt[tmp-97] = i;
			//val++;
		} 
		
		for (int i=0; i<26; i++) { 
			System.out.print(cnt[i] + " "); 
		} 
		//int a = 'a';	// 97 
		//int b = 'b';	// 98
		
		
	}
}

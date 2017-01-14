package com.amikth.algoEx02;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/11655
 * 
 * ROT13�� ī�̻縣 ��ȣ�� �������� ���� ���ĺ��� 13���ھ� �о �����.
 * ���� ���, "Baekjoon Online Judge"�� ROT13���� ��ȣȭ�ϸ�
 *  "Onrxwbba Bayvar Whqtr"�� �ȴ�.
 *   ROT13���� ��ȣȭ�� ������ ���� �������� �ٲٷ��� ��ȣȭ�� ���ڿ��� �ٽ� ROT13�ϸ� �ȴ�. 
 *   �տ��� ��ȣȭ�� ���ڿ� "Onrxwbba Bayvar Whqtr"�� 
 *   �ٽ� ROT13�� �����ϸ� "Baekjoon Online Judge"�� �ȴ�.
 *   ROT13�� ���ĺ� �빮�ڿ� �ҹ��ڿ��� ������ �� �ִ�. 
 *   ���ĺ��� �ƴ� ���ڴ� ���� ���� �״�� ���� �־�� �Ѵ�. 
 *   ���� ���, "One is 1"�� ROT13���� ��ȣȭ�ϸ� "Bar vf 1"�� �ȴ�.
 *   ���ڿ��� �־����� ��, "ROT13"���� ��ȣȭ�� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� ���ĺ� �빮��, �ҹ���, ����, ���ڷθ� �̷���� ���ڿ� S�� �־�����. 
 * S�� ���̴� 100�� ���� �ʴ´�.
 * 
 * ���
 * ù° �ٿ� S�� ROT13���� ��ȣȭ�� ������ ����Ѵ�.
 * 
 * ���� �Է�
 * Baekjoon Online Judge
 * 
 * ���� ���
 * Onrxwbba Bayvar Whqtr
 * ****************************
 * ���� �Է�
 * One is 1
 * 
 * ���� ���
 * Bar vf 1
 * 
 * ***************************
 * �ƽ�Ű�ڵ� http://psychoria.blog.me/40107957370
 * 
 * */

public class TestStringROT13 {
	public static String rot13(String s) {
		String ans="";
		for(int i=0; i< s.length(); i++) {
			char c = s.charAt(i);
			if( (c >= 'a' && c <= 'm') || ( c >= 'A' && c <= 'M')) {	
				c += 13;
			} else if ( (c >= 'n' && c <= 'z') || ( c >= 'N' && c <= 'Z')) {	
				c -= 13;
			} 
			ans += c;
		}
		
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		 
		System.out.print(rot13(s)); 
		
	}
}

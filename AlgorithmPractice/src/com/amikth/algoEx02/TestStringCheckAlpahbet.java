package com.amikth.algoEx02;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10820
 * 
 * 문자열 N개가 주어진다. 
 * 이 때, 문자열에 포함되어 있는 소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램을 작성하시오.
 * 각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다.
 * 
 * 입력
 * 첫째 줄부터 N번째 줄까지 문자열이 주어진다. 
 * (1 ≤ N ≤ 100) 문자열의 길이는 100을 넘지 않는다.
 * 
 * 출력
 * 첫째 줄부터 N번째 줄까지 각각의 문자열에 대해서 
 * 소문자, 대문자, 숫자, 공백의 개수를 공백으로 구분해 출력한다
 * 
 * 예제 입력
 * This is String
SPACE    1    SPACE
 S a M p L e I n P u T     
0L1A2S3T4L5I6N7E8

 * 
 * 예제 출력
 * 10 2 0 2
0 10 1 8
5 6 0 16
0 8 9 0

 * */

public class TestStringCheckAlpahbet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			int lower = 0;
			int upper = 0;
			int digit = 0;
			int space = 0;
			for(int i=0; i < s.length(); i++) {
				char c = s.charAt(i);
				if('A' >= c && c <= 'Z') {
					upper += 1;
				} else if('a' >= c && c <= 'z') {
					lower += 1;
				} else if('0' >= c && c <= '9') {
					digit += 1;
				} else if(c == ' ') {
					space += 1;
				}
			}
			
			System.out.println(lower + " " + upper + " " + digit + " " + space);
		} 
		
	}
}

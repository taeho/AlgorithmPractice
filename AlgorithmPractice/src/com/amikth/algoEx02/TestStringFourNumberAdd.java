package com.amikth.algoEx02;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10824
 * 
 * 네 자연수 A, B, C, D가 주어진다.
 *  이 때, A와 B를 붙인 수와 C와 D를 붙인 수의 합을 구하는 프로그램을 작성하시오
 *  두 수를 A와 B를 합치는 것은 A의 뒤에 B를 붙이는 것을 의미한다. 
 *  즉, 20과 30을 붙이면 2030이 된다.
 * 
 * 입력
 * 첫째 줄에 네 자연수 A, B, C, D가 주어진다. (1 ≤ A, B, C, D ≤ 1,000,000)
 * 
 * 출력
 * A와 B를 붙인 수와 C와 D를 붙인 수의 합을 출력한다.
 * 
 * 예제 입력
 * 10 20 30 40
 * 
 * 예제 출력
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

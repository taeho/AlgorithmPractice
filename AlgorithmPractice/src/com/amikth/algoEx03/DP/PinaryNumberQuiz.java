package com.amikth.algoEx03.DP;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2193
 * 0과 1로만 이루어진 수를 이진수라 한다.
 * 이러한 이진수 들 특별한 성질을 갖는 것들이 있는데, 
 * 이들을 이친수(pinary number)라 한다. 이친수는 다음의 성질을 만족한다.
 * 
 * 1.이친수는 0으로 시작하지 않는다.
 * 2.이친수에서는 1이 두 번 연속으로 나타나지 않는다. 즉, 11을 부분 문자열로 갖지 않는다.
 * 
 * 예를 들면 1, 10, 100, 101, 1000, 1001 등이 이친수가 된다.
 * 하지만 0010101이나 101101은 각각 1, 2번 규칙에 위배되므로 이친수가 아니다.
 * 
 * N(1≤N≤90)이 주어졌을 때, N자리 이친수의 개수를 구하는 프로그램을 작성하시오.
 * 
 * 입력 
 * 첫째 줄에 N이 주어진다.
 * 
 * 출력
 * 첫째 줄에 N자리 이친수의 개수를 출력한다.
 * 
 * 예제 입력
 * 3
 * 
 * 예제 출력
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

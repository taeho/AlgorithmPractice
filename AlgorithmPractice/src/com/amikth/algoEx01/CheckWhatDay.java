package com.amikth.algoEx01;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1924
 * 문제 : 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 
 *       이를 알아내는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 
 * 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 
 *      4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
 * 출력 : 첫째 줄에 x월 y일이 무슨 요일인지에 따라 
 * SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
 * 
 * */

public class CheckWhatDay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		int rtDayByMn = RtDayByMonth (a);
		//System.out.println("rtDayByMn= " + rtDayByMn);
		int totDay = rtDayByMn + b;
		
		//System.out.println("totDay= " + totDay);
		
		System.out.println(RtDayByTotDate(totDay));
		
	}
	
	public static int RtDayByMonth(int vMonth) {
		
		int rtDay = 0;
		for(int i=1; i<=vMonth; i++) {
			// 1~ vMonth까지의 합
			if( i == 3 || i == 5
					|| i == 7 || i == 8 || i == 10
					|| i == 12 ) {
				rtDay += 31;
			} else if (i == 4 || i == 6 
					|| i == 9 || i == 11 ) {
				rtDay += 30;
			} else if (i == 1 ) {
				rtDay += 0;
			} else {	// i = 2
				rtDay += 28;
			}
		}
		return rtDay;
//		if(vMonth == 1 || vMonth == 3 || vMonth == 5
//				|| vMonth == 7 || vMonth == 8 || vMonth == 10
//				|| vMonth == 12 ) {
//			rtDay += 31;
//		} else if (vMonth == 4 || vMonth == 6 
//				|| vMonth == 9 || vMonth == 11 ) {
//			rtDay += 30;
//		} else {	// vMonth = 2
//			rtDay += 28;
//		}
	}
	
	public static String RtDayByTotDate(int vDate) {
		
		String res = "NOP";
		switch(vDate % 7) {
			case 0:
				res = "SUN";
				break;
			case 1:
				res = "MON";
				break;
			case 2:
				res = "TUE";
				break;
			case 3:
				res = "WED";
				break;
			case 4:
				res = "THU";
				break;
			case 5:
				res = "FRI";
				break;
			case 6:
				res = "SAT";
				break;
		}
		return res;
	}
}

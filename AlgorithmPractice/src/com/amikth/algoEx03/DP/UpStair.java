package com.amikth.algoEx03.DP;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/11057
 * 
 * ������ ���� ���� �ڸ��� ���������� �̷�� ���� ���Ѵ�. 
 * �� ��, ������ ���� ���Ƶ� ������������ ģ��.
 * ���� ���, 2234�� 3678, 11119�� ������ ��������, 2232, 3676, 91111�� ������ ���� �ƴϴ�.
 * ���� ���� N�� �־����� ��, ������ ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� 0���� ������ �� �ִ�.
 * ��: 1233345, 357, 8888888, 1555999
 * 
 * �Է�
 * ù° �ٿ� N (1 �� N �� 1,000)�� �־�����.
 * 
 * ���
 * ù° �ٿ� ���̰� N�� ������ ���� ������ 10,007�� ���� �������� ����Ѵ�.
 * 
 * 
 * �����Է� 
 * 1
 * �������
 * 10
 * 
 * �����Է� 
 * 2
 * �������
 * 55
 * 
 * �����Է� 
 * 3
 * �������
 * 220
 *  
 * D[N][L] = D[N-1][k] ( 0 <= L <= L )
 * D[i][j] = ���̰� i �̰�, ������ ���ڰ� j�� ������ ���� ����
 * D[1][j] = 1 
 * 
 * */

public class UpStair {
	public static long mod = 10007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] d = new long[n+1][10];
		for(int i=0; i<=9; i++){
			d[1][i] = 1;
		}
		for(int i=2; i<=n; i++) {
			for(int j=0; j<=9; j++) {
				for(int k=0; k<= j; k++ ) {
					d[i][j] += d[i-1][k];
					d[i][j] %= mod;
				}
			}
		}
		long ans = 0;
		for(int i=0; i<10; i++) {
			ans += d[n][i];			
		}
		ans %= mod;
		System.out.println(ans);
	}
}

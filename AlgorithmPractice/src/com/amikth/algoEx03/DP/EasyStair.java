package com.amikth.algoEx03.DP;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10844
 * 45656�̶� ���� ����.
 * �� ���� ������ ��� �ڸ����� ���̰� 1�� ����. �̷� ���� ��� ����� �Ѵ�.
 * �����̴� ���� ���̰� N�� ��� ���� �� �� �ִ��� �ñ�������. * 
 * N�� �־��� ��, ���̰� N�� ��� ���� �� �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. (0���� �����ϴ� ���� ����.)
 * 
 * �Է�
 * ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 100���� �۰ų� ���� �ڿ����̴�.
 * 
 * ���
 * ù° �ٿ� ������ 1,000,000,000���� ���� �������� ����Ѵ�.
 * 
 * 
 * �����Է� 
 * 1
 * �������
 * 9
 * 
 * �����Է� 
 * 2
 * �������
 * 17
 *  
 * D[N][L] = N�ڸ� ��ܼ�, ������ �� : L, �� ���̰� N�̰�, ������ ���ڰ� L�� ��� ���� ����
 * D[N][L] = D[N-1][L-1] + D[N-1][L+1] ,  (1<= L <= 8 )
 * 
 * */

public class EasyStair {
	public static long mod = 1000000000L;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] d = new long[n+1][10];
		for(int i=1; i<=9; i++){
			d[1][i] = 1;
		}
		for(int i=2; i<=n; i++) {
			for(int j=0; j<=9; j++) {
				d[i][j] = 0;
				if(j-1 >= 0) {
					d[i][j] += d[i-1][j-1];
				}
				if(j+1 <= 9){
					d[i][j] += d[i-1][j+1];
				}
				d[i][j] %= mod;				
			}
		}
		long ans = 0;
		for(int i=0; i<=9; i++) {
			ans += d[n][i];			
		}
		ans %= mod;
		System.out.println(ans);
	}
}

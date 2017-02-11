package com.amikth.algoEx03.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 * https://www.acmicpc.net/problem/9465
 * 
 * ���� 
 * ������� ������ ����̴� ���汸���� ��ƼĿ 2n���� �����ߴ�. 
 * ��ƼĿ�� �׸� (a)�� ���� 2�� n���� ��ġ�Ǿ� �ִ�. 
 * ����̴� ��ƼĿ�� �̿��� å���� �ٹ̷��� �Ѵ�
 * 
 * ����̰� ������ ��ƼĿ�� ǰ���� �ſ� ���� �ʴ�. 
 * ��ƼĿ �� ���� ����, �� ��ƼĿ�� ���� �����ϴ� ��ƼĿ�� 
 * ��� �������� ����� �� ���� �ȴ�. 
 * ��, �� ��ƼĿ�� ����, ������, ��, �Ʒ��� �ִ� ��ƼĿ�� ����� �� ���� �ȴ�.
 * 
 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. 
 * �� �׽�Ʈ ���̽��� ù° �ٿ��� n (1 �� n �� 100,000)�� �־�����. 
 * ���� �� �ٿ��� n���� ������ �־�����, 
 * �� ������ �� ��ġ�� �ش��ϴ� ��ƼĿ�� �����̴�. 
 * �����ϴ� �� ���� ���̿��� �� ĭ�� �ϳ� �ִ�. 
 * ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�
 * 
 * �����Է�
 * 2
 * 5
 * 50 10 100 20 40
 * 30 50 70 10 60 
 * 7
 * 10 30 10 50 100 20 40
 * 20 40 30 50 60 20 80
 * 
 * ���� ���
 * 260
 * 290
 * *************************************
 * D[i][j] = 2 x i ���� ���� �� �ִ� �ִ� ����, i��° ������ �ߴ� ��ƼĿ�� j
 * j=0 : ��������.
 * j=1 : ���� ��ƼĿ�� ����
 * j=2 : �Ʒ��� ��ƼĿ�� ����.
 * 
 * D[i][j] = 2 x i ���� ���� �� �ִ� �ִ� ����, i ��° ������ ��� ��ƼĿ�� j
 * 
 * * ���� ���� ( D[i][0] )
 * i-1������ ��ƼĿ�� ��� ������� ����� ����.
 * max(D[i-1][0], D[i-1][1], D[i-1][2])
 * 
 * * ���� ����Ű�� ���� ( D[i][1] )
 * i-1 ������ ���� ��ƼĿ�� ������ �ȵȴ�.
 * max(D[i-1][0], D[i-1][2], D[i][0])
 *
 * * �Ʒ��� ����Ű�� ���� ( D[i][2] )
 * i-1 ������ �Ʒ��� ��ƼĿ�� ������ �ȵȴ�.
 * max(D[i-1][0], D[i-1][1], D[i][1])
 *
 * 
 * */


public class StickerQuiz {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tm = String.valueOf(br.readLine());
		int t = Integer.parseInt(tm);
		while(t-- > 0 ){
			String nm = String.valueOf(br.readLine());
			int n = Integer.parseInt(nm);
			long[][] a = new long[n+1][2];
			{
				String[] line = br.readLine().split(" ");
				for(int i=1; i<= n; i++) {
					String in = String.valueOf(line[i-1]);
					a[i][0] = Long.parseLong(in);
				}
			}
			{
				String[] line = br.readLine().split(" ");
				for(int i=1; i<= n; i++ ) {
					String in = String.valueOf(line[i-1]);
					a[i][1] = Long.parseLong(in);
				}
			}
			long[][] d = new long[n+1][3];
			for(int i=1; i<=n; i++) {
				d[i][0] = Math.max(d[i-1][0], Math.max(d[i-1][1], d[i-1][2]));
				d[i][1] = Math.max(d[i-1][0], d[i-1][2])+d[i][0];
				d[i][2] = Math.max(d[i-1][0], d[i-1][1])+d[i][1];
			}
			long ans = 0;
			ans = Math.max(d[n][0], Math.max(d[n][1], d[n][2]));
			System.out.println(ans);
		}
	}
}

package com.amikth.algoEx03.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 * https://www.acmicpc.net/problem/9465
 * 
 * 문제 
 * 상근이의 여동생 상냥이는 문방구에서 스티커 2n개를 구매했다. 
 * 스티커는 그림 (a)와 같이 2행 n열로 배치되어 있다. 
 * 상냥이는 스티커를 이용해 책상을 꾸미려고 한다
 * 
 * 상냥이가 구매한 스티커의 품질은 매우 좋지 않다. 
 * 스티커 한 장을 떼면, 그 스티커와 변을 공유하는 스티커는 
 * 모두 찢어져서 사용할 수 없게 된다. 
 * 즉, 뗀 스티커의 왼쪽, 오른쪽, 위, 아래에 있는 스티커는 사용할 수 없게 된다.
 * 
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
 * 각 테스트 케이스의 첫째 줄에는 n (1 ≤ n ≤ 100,000)이 주어진다. 
 * 다음 두 줄에는 n개의 정수가 주어지며, 
 * 각 정수는 그 위치에 해당하는 스티커의 점수이다. 
 * 연속하는 두 정수 사이에는 빈 칸이 하나 있다. 
 * 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다
 * 
 * 예제입력
 * 2
 * 5
 * 50 10 100 20 40
 * 30 50 70 10 60 
 * 7
 * 10 30 10 50 100 20 40
 * 20 40 30 50 60 20 80
 * 
 * 예제 출력
 * 260
 * 290
 * *************************************
 * D[i][j] = 2 x i 에서 얻을 수 있는 최대 점수, i번째 열에서 뜨는 스티커는 j
 * j=0 : 뜯지않음.
 * j=1 : 위쪽 스티커를 뜯음
 * j=2 : 아래쪽 스티커를 뜯음.
 * 
 * D[i][j] = 2 x i 에서 얻을 수 있는 최대 점수, i 번째 열에서 뜯는 스티커는 j
 * 
 * * 뜯지 않음 ( D[i][0] )
 * i-1열에서 스티커를 어떻게 뜯었는지 상관이 없다.
 * max(D[i-1][0], D[i-1][1], D[i-1][2])
 * 
 * * 위쪽 스터키를 뜯음 ( D[i][1] )
 * i-1 열에서 위쪽 스티커는 뜯으면 안된다.
 * max(D[i-1][0], D[i-1][2], D[i][0])
 *
 * * 아래쪽 스터키를 뜯음 ( D[i][2] )
 * i-1 열에서 아래쪽 스티커는 뜯으면 안된다.
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

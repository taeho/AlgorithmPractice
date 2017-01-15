package com.amikth.algoEx02.temp;

import java.util.Scanner;
import java.util.Stack;

/*
 * https://tara.vitapowered.com/TestEngine
 * 
 *  
 *  */


public class Solution {
	public static void main(String[] args) {
		int res = 0;
		int n = 8;
		String[] arr = {"5", "-2", "4","Z", "X", "9", "+" , "+" };
		res = totalScore(arr, n);
		System.out.println("> res = " + res);
		
	}
	
	public static int totalScore(String[] blocks, int n) {
		Stack stk = new Stack();
		Stack score = new Stack();
		int totalScore =0;
		//int score =0;
		for(int i=0; i<n; i++ ) {
			if(blocks[i].equals("X")) {
				String tmpX = String.valueOf(stk.pop());
				int tmpDb = Integer.parseInt(tmpX) * 2;
				stk.push(new Integer(tmpDb));
				// 시점의 스코어 기록 
				score.push(new Integer(tmpDb));
				totalScore += tmpDb;
			} else if(blocks[i].equals("+")) {
				int tsize = score.size();
				String tma1 = "";
				String tma2 = "";
				for(int j=0 ; j < tsize; j++ ) {
					if(j == tsize-1) {
						tma1 = String.valueOf(score.get(j-1));
						tma2 = String.valueOf(score.get(j));
					}
				}
				int intma1 = Integer.parseInt(tma1);
				int intma2 = Integer.parseInt(tma2);
				int resTm = 0;
				resTm = intma1 + intma2;
				score.push(new Integer(resTm));
				totalScore += resTm; 
			} else if(blocks[i].equals("Z")) {
				String tmpZ = String.valueOf(stk.pop());
				// 시점의 스코어 기록 
				score.push(new Integer(tmpZ));
				totalScore -= Integer.parseInt(tmpZ);
			} else {
				stk.push(new Integer(Integer.parseInt(blocks[i])));
				// 시점의 스코어 기록 
				score.push(blocks[i]);
				totalScore += Integer.parseInt(blocks[i]);
			}
		}
		return totalScore;
	}
}

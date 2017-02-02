package com.amikth.algoEx02.temp;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * Given a list of numbers as input, e.g. :

25626 25757 24367 24267 16 100 2 7277

Output a delta encoding for the sequence. In a delta encoding, the first element is reproduced as-is. Each subsequent element is represented as the numeric difference from the element before it. E.g. for the sequence above, the delta encoding would be:

25626 131 -1390 -100 -24251 84 -98 7275

However, if a difference value does not fit in a single signed byte, i.e. -127 <= x <= 127, then, instead of the difference, we would like to use an escape token, printing it.

This will denote that the value following the escape token is a full four-byte difference value, rather than a one-byte difference value.

For this exercise, we'll declare -128 as the escape token.

Following the same example above, the final output would be:

25626 -128 131 -128 -1390 -100 -128 -24251 84 -98 -128 7275

 * */
public class SolutionDeltaEncoding {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arrBuffer = sc.nextLine();
		
		LinkedList list = new LinkedList();  
		// 분리 토큰은 space로 하자 
	    StringTokenizer token = new StringTokenizer(arrBuffer, " ");  
	      
	    String str_value;  
	      
	    while (token.hasMoreTokens()) {  
	        str_value = token.nextToken();  
	        list.add(str_value);  
	    }
	    DeltaEncoding(list);
//	    System.out.println("================");
//	    for(int i=0; i<list.size(); i++) {
//	    	System.out.print(list.get(i) + " ");
//	    }
		//////////////////////////////////////////////////////////////////////////		
		
 
	}
	
	public static void DeltaEncoding(LinkedList arr) {
		// 체크 용 토큰 
		String escToken = "-128";
		
		// 스택선언 
		Stack res1 = new Stack();
		Stack res2 = new Stack();
		
		for(int i=0; i < arr.size(); i++) {
			if(i==0) {
				res1.push(arr.get(i));
			} else {
				int cp1 = Integer.parseInt(String.valueOf(arr.get(i)));
				int cp2 = Integer.parseInt(String.valueOf(arr.get(i-1)));
				int rea = cp1-cp2;
				// res1.push(rea); // jdk7
				res1.push(String.valueOf(rea)); // jdk8
			}			
		}
		//System.out.println("res1 ");
		for(int k=0; k < res1.size() ; k++) {
			System.out.print( " " + res1.get(k));	
		}
		
		System.out.println();
		for(int i=0; i < res1.size(); i++) {
			if(i==0) {
				res2.push(res1.get(i));
			} else {
				int chk = Integer.parseInt( String.valueOf(res1.get(i)));
				//System.out.println(chk);
				if( chk <= -127 || chk >= 127) {					
					res2.push(escToken);						
				} 
				res2.push(res1.get(i));
				
			}			
		}
//		System.out.println("res1 ");
//		for(int k=0; k < res1.size() ; k++) {
//			System.out.print( " " + res1.get(k));	
//		}
//		System.out.println();
//		System.out.println("res2 ");
		for(int k=0; k < res2.size() ; k++) {
			System.out.print( res2.get(k) + " ");	
		}
	}
} 
package com.amikth.algoEx02.temp;

import java.util.Scanner;
import java.util.Stack;
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

	public static void main(String[] args ) { 
				
		String escToken = "-128";
//		Scanner sc = new Scanner(System.in);
		
//		int[] arb = new int[127];
//		//int input = sc.nextInt();
//		for(int i=0; i < arb.length; i++) {
//			arb[i] = sc.nextInt();
//			if(sc.equals("\n")  ) {
//				break;
//			}
//		}
		
//		Stack temp1 = new Stack();
//		
//		for(int i=0; i < arb.length; i++) {
//			if(i==0) {
//				temp1.push(arb);
//			} else {
//				temp1.push(arb[i] - arb[i-1]);				
//			}			
//		}
//		System.out.println("res1 ");
//		for(int k=0; k < temp1.size() ; k++) {
//			System.out.print( " " + temp1.get(k));	
//		}
		
		String[] arr = {"25626", "25757", "24367","24267", "16", "100", "2" , "7277" };
		Stack res1 = new Stack();
		Stack res2 = new Stack();
		
		for(int i=0; i < arr.length; i++) {
			if(i==0) {
				res1.push(arr[i]);
			} else {
				res1.push(new Integer(Integer.parseInt(arr[i]) - Integer.parseInt(arr[i-1])));				
			}			
		}
		System.out.println("res1 ");
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

package com.amikth.algoEx02.temp;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test cast 
		// (h[e{lo}!]~)()()()(
		// result = 0
		
		//test cast 
		// [](){}<>
		// result = 1
		int res1 = 0;
		int res2 = 0;
		String test1 = "(h[e{lo}!]~)()()()(";
		String test2 = "[](){}<>";
		res1 = hasBalncedBrackets(test1);
		res2 = hasBalncedBrackets(test2);
		
		System.out.println("res1 = (0) = " + res1);
		System.out.println("res2 = (1) = " + res2);
		 
		
	}
	
	public static int hasBalncedBrackets(String str) {
		int result = 0;
		int vtrue = 0; 
		char[] constraint = { '(', ')', '{', '}', '[', ']', '<', '>' };
	 
		if( str != null) {			
			for(int i=0; i<str.length(); i++) {
				char chk = str.charAt(i);				 
				for(int j=0; j < constraint.length; j++ ) {
					if(chk == constraint[j]) {	// °°À¸¸é						 
						vtrue++;
						break;
					} else {
						vtrue--;
					}
				}
				if(vtrue > 0){
					result=0;
					vtrue=0; 
				} else {
					result=1;
					vtrue=0; 
				}
			}
		}
		return result;
	}
	
}

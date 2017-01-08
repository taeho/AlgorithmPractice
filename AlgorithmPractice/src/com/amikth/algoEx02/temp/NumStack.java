package com.amikth.algoEx02.temp;

/*
 * https://youtu.be/5ENou-R660g?list=PLVNY1HnUlO27coB3gP29gjhc4XlCcldEN
 * https://github.com/minsuk-heo/java_coding_interview/blob/master/src/data_structure/NumStack.java
 * 
 * 
 * */

public class NumStack {
	private int[] arr;
	private int top = 0;
	public NumStack(int stackSize) {
		this.arr = new int[stackSize];
	}
	
	public static void main(String[] args) {
		NumStack st = new NumStack(3);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
	}
	
	private int peek() {
		return arr[top-1];
	}
	
	private int pop() {
		if(top > 0 ) {
			return arr[--top];
		} else {
			throw new java.util.NoSuchElementException();
		}
	}
	
	public void push(int i) {
		if(top < arr.length) {
			arr[top++] = i;
			System.out.println("pushed: " + i);
		} else {
			System.out.println("Stack is full!");
		}
		
	}
}

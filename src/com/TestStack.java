package com;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		for(int i=0;i<=s.size();i++){ // i increases stack size decreases
//			System.out.println(s.pop());
		}
		
		int  i = s.search(1);
		System.out.println(i);
		
	}
	
	public <T> void printArray(T[] t){
		
	}

}

package com.questions;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
	
	Set<String> unique = new HashSet<>(); 
	
	public void permute(String str, int l, int r) {

		if (l == r){
//			unique.add(str);
			System.out.println(str);
		}
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);// backtracking
			}
		}
	}

	
	private String swap(String str, int l, int i) {
		// TODO Auto-generated method stub
		char[] strCharArr = str.toCharArray();
		char temp = strCharArr[l];
		strCharArr[l]=strCharArr[i];
		strCharArr[i]=temp;
		return String.valueOf(strCharArr);
	}


	public static void main(String[] args){
		StringPermutation s = new StringPermutation();
		String str = "abc"; 
		s.permute(str, 0, str.length()-1);
		for(String st : s.unique){
			System.out.println(st);
		}
	}
	
	
}

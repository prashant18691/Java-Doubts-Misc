package com.questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCombination {
	
	final  String input;
	StringBuilder output = new StringBuilder();
	
	

	public StringCombination(String input) {
		super();
		this.input = input;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s = reader.readLine();
			StringCombination sc = new StringCombination(s);
			
			sc.findCombinations(0);
		
		
	}

	private  void findCombinations(int s) {
		for(int i=s;i<input.length();i++){
			output.append(input.charAt(i));
			System.out.println(output);
			if(i<input.length())
			findCombinations(i+1);
			output.setLength(output.length()-1);// backtrackking
			
		}
		
	}

}

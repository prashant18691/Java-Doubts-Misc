package com;

import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

	    
		while(t>0){
		    int n = sc.nextInt();
		    GFG g = new GFG();
		   System.out.println(g.reverse(n));
		    
		    t--;
		}
	}
	
	public Integer reverse(Integer i){
	  
		if(i==null){
			return null;
		}
		StringBuilder sb = new StringBuilder("");
		while(i>0){
			sb.append(i%10);
			i/=10;
		}
	  
	    
	    return Integer.parseInt(sb.toString());
	   
	}
}

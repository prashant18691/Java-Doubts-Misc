package com.questions;

import java.io.IOException;
import java.util.Scanner;

public class ChocolateFunda {

	public static void main(String[] args) throws NumberFormatException, IOException { 
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        
        while(t>0){
        	int n,k;
        	if(reader.hasNextInt())
        	 n = reader.nextInt();
        	else
        		return;

        	if(reader.hasNextInt())
        	 k = reader.nextInt();
        	else 
        		return;
        	
        	System.out.println(getNoOfWays(n,k));
        	
        	t--;
        }
        
        reader.close();
        
	}

	private static int getNoOfWays(int n, int k) {
		if(n<k)
			return 0;
		
		if(n==k)
			return 1;
		
		return getFactorial(n-1)/(getFactorial(n-k)*getFactorial(k-1));
				
	}
	
	static int getFactorial(int a){
		if(a==0)
			return 1;
		
		a = a*getFactorial(a-1);
		
		return a;
	}

}

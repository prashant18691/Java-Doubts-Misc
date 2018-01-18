package com;

public class PalindromeLength {
	
	static int findMax(int x, int y){
		
		return (x>y)?x:y;
	}

	
	int lps(String s){
		
		int n = s.length();
		int i,j,cl;
		
		int[][] lpa = new int[n][n];
		
		for(int k=0;k<n;k++)
			lpa[k][k]=1;
		
		for(cl=2;cl<=n;cl++){
			for(i=0;i<n-cl+1;i++){
				j = i+cl-1;
				
				if(s.charAt(i)==s.charAt(j) && cl==2)
					lpa[i][j]=2;
				else if(s.charAt(i)==s.charAt(j))
					lpa[i][j]=2+lpa[i+1][j-1];
				else
					lpa[i][j]=findMax(lpa[i+1][j], lpa[i][j-1]);
				
			}
		}
		
		return lpa[0][n-1];
		
	}
	
	public static void main(String[] args) {
		
		PalindromeLength p = new PalindromeLength();
		System.out.println(p.lps("abdabbakk"));
		

	}

}

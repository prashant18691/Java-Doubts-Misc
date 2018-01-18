package com;

public class CheckPalindrome {

	public CheckPalindrome() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean check(String s){
		boolean result = false;
		if(s!=null){
		int count = 0;
		int lenght = s.length();
		
		if(lenght%2==0){
		lenght=	(lenght/2)-1;
		}
		else{
			lenght=lenght/2;
		}
		
			for(int i=0;i<=lenght;i++){
				if(s.charAt(i)==s.charAt(s.length()-1-i)){
					count++;
				}
			}
			
			if(count==lenght+1)
				result=true;
		}
		
		
		return result;
	}
	
	public boolean isP(String s){
		boolean isP=false;
		String result = "";
		
		if(s!=null){
			String temp = null;
			for(int i=1;i<=s.length();i++){
			temp = s.substring(s.length()-i,s.length()-i+1);
			result+=temp;
//			System.out.println(s);
			}
		}
		
		if(s.equals(result))
			isP=true;
			
		
		return isP;		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPalindrome p = new CheckPalindrome();
		String str="a";
		String reverse=CheckPalindrome.reverseRecu(str);
		System.out.println(reverse.equals(str));

	}

	private String reverse(String s) {
		String result = null;
		
		if(s!=null){
			String temp = null;
			for(int i=1;i<=s.length();i++){
			temp = s.substring(s.length()-i,s.length()-i+1);
			result+=temp;
//			System.out.println(s);
			}
		}
		return result;
	}
	
	 public static String reverseRecu(String str) {
	        if (str == null) {
	            return null;
	        }

	        if (str.length() <= 1) {
	            return str;
	        }

	        return reverseRecu(str.substring(1)) + str.charAt(0);
	    }



	
	

}

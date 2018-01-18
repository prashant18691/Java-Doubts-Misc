package com;

public class TestStringRotation {
	
	public boolean checkStringRotation(String str1,String str2){
		String str = str1.concat(str1);
		
		/*if(str1.length()==str2.length() && str.contains(str2))
			return true;*/
		
		if(str1.length()==str2.length() && str.indexOf(str2)!=-1)
			return true;
		
		return false;
	}

	public static void main(String[] args) {

		TestStringRotation test = new TestStringRotation();
		System.out.println(test.checkStringRotation("abcd", "cdab"));
				
	}

}

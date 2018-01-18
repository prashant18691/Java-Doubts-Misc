package com;

public class OverloadigCalc {

	 void sum(int a,long b){System.out.println("a method invoked");}  
	  void sum(long a,int b){System.out.println("b method invoked");}  
	  
	  public static void main(String args[]){  
		  OverloadigCalc obj=new OverloadigCalc();  
	  obj.sum(20L,20);//now ambiguity  
	  }  

}

interface AB{
	
}

class B implements AB{
	
}

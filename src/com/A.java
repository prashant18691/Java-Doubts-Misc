package com;

import java.io.IOException;

class A {
	
	static{
		new A().getA().msg();
		int c = new A().C;
	}
	
	A getA() {
		return this;
	}
	
	protected int C=0;

	void msg() {
		System.out.println("Hello java");
	}
	
    void m() throws IOException{  
    //method code 
    	try{
    	throw new IOException();
    	}
    	catch(Exception e){
    		
    	}
    }  
}



	class Test1 {
		public static void main(String args[]) {
			
		}
	}

package com.p;

public class TestCase {

	static int x = 0;
	
	public TestCase() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		TestCase c = new TestCase();
		
		System.out.println(f(x)==f(x)?f(x):"#");
		System.out.println(g(x)==g(x)?f(x):"#");
		

	}
	
	static int f(int x){
		return ++x;
	}
	
	static int g(int x){
		return x++;
	}

}

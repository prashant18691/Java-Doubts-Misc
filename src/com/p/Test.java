package com.p;

abstract class AB {

	abstract void a();

	void b() {
		System.out.println("method b in AB");
	}

	public AB() {
		// TODO Auto-generated constructor stub
	}

}

class Y extends AB {

	@Override
	void a() {
		System.out.println("method a in Y");

	}

}

public class Test {
	public static void main(String[] a) {
		
	Y y = new Y();
	y.a();
	y.b();
	
	
	}
}

interface A{
	
}

interface B extends A{
	
}

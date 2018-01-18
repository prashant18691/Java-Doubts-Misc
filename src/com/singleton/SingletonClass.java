package com.singleton;

public class SingletonClass {
	
	private static SingletonClass obj;
	
	/*static{
		obj = new SingletonClass();
	}*/

	private SingletonClass() {
		// TODO Auto-generated constructor stub
	}
	
	/*public static synchronized SingletonClass getInstance(){
		if(obj==null)
			obj=new SingletonClass();
		
		return obj;
	}*/
	
	/*public static  SingletonClass getInstance(){
		
		synchronized(SingletonClass.class){
		if(obj==null)
			obj=new SingletonClass();
		}
		
		return obj;
	}*/
	
public static  SingletonClass getInstance(){
	
	return SingletonHelper.INSTANCE;
}
	
	private static class SingletonHelper{
		private static final SingletonClass INSTANCE = new SingletonClass();
	}
	
	void test(){
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonClass cls = getInstance();
		cls.test();
		
	}
	
	

}

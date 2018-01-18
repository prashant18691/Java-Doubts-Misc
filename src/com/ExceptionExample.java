package com;

import java.io.IOException;

public class ExceptionExample {
	
	void A() throws IOException{
		System.out.println("parent");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AEx a =new AEx();
		a.A();

	}

}

class AEx extends ExceptionExample{

	@Override
	void A() throws IOException{
		System.out.println("child");
		
	}
	
	void B() throws Exception{
		throw new InvalidAgeException("");
	}
	
   
	
}
class InvalidAgeException extends Exception{  
    InvalidAgeException(String s){  
     super(s);  
    }  
   } 


abstract class Person{  
    abstract void eat();  
    
    void dr(){
    	
    }
  }  

abstract interface Fellow{
	 abstract void drink();
	 
}
  class TestAnonymousInner1{  
   public static void main(String args[]){  
		Person p = new Person() {

			void b() {

			}

			@Override
			void eat() {

				System.out.println("eat");
			}
		};  
    p.eat();  
   }  
  }  
  
  class TestAnonymousInner2{  
	   public static void main(String args[]){  
		   Fellow p = new Fellow() {

				void b() {

				}

				@Override
				public void drink() {
					System.out.println("eat");
				}
			};  
	   }  
	  }  

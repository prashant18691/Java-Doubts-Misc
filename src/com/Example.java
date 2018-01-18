package com;

public class Example {

	public Example() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		FoodFactory fFactory = new FoodFactory();
		Food one = fFactory.getFood("Pizza",220,"Dominos",2);
		Food two = fFactory.getFood("Burger",160,"Burger King",1);
		System.out.println(one + " :: "+two);
		
		
		/*ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ravi");  
		  al2.add("Hanumat");  
		  
		  al.retainAll(al2);  
		  
		  System.out.println("iterating the elements after retaining the elements of al2...");  
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  */
	}
	
	
}








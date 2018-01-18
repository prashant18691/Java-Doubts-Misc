package com.questions;

public class Arrays {
	
	
	static void test(int[] b) {
		int[] c = new int[2];
		b = c;
		System.out.print(c.length);
		System.out.print(b.length);
	}
	
	final static int x[] = new int[5];

	public static void main(String[] args) {

		int[] a = new int[0];
		System.out.println(a.length);
		
		System.out.println("...........................");
		
		int[] b = new int[5];
		test(b);
		System.out.println(b.length);
		
		System.out.println("...........................");
		
/*		String entries[] = {"entry1","entry2"};
		int count=0; 
		while (entries [count++]!=null){
			System.out.println(count);
		}
                   System.out.println(count);
              		
        System.out.println("...........................");
        
        final int x = new Arrays().x[5];
		if (x <= 10)
			System.out.println("javachamp");
           		
        System.out.println("...........................");*/
        
        byte b1= 25;

        byte b2=45;

        //byte b3= b1+b2;	JVM automatically converts the result to the integer,So integer can't store into the byte so,It gets compile error
        System.out.println("...........................");
        
        for(int y=0;args.length>y++;){
    		System.out.print(args[y]+ " ");
    		}
        System.out.println("..........................."); 
        
        Object obj = new int[] { 1, 2, 3 }; // line 12
        int[] someArray = (int[])obj; // line 13
        for (int i : someArray) System.out.print(i + " "); // line 14
        
        
        
	}

}

package com;

public class FindMaxInArray {
	
	static int findMax(int[] arr){
		
		int max = Integer.MIN_VALUE;
		
		for(int a : arr){
			if(a>max)
				max=a;
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-31,3,4,9,0,2,21,5,8,10};
		System.out.println(findMax(arr));
	}

}

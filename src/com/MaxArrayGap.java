package com;

public class MaxArrayGap {
	
	int findMaxGap(int[] arr){
		int min = arr[0];
		int max = arr[1];
		int diff = Math.abs(max-min);
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min)
				min = arr[i];
			 if(arr[i]>max)
				max=arr[i];
			if(diff<Math.abs(max-min))
				diff=Math.abs(max-min);
		}
		
		return diff;
	}

	public static void main(String[] args) {

		MaxArrayGap gap = new MaxArrayGap();
		int[] arr = {3,4,9,0,31,2,21,5,8,10};
		System.out.println(gap.findMaxGap(arr));
	}

}

package com;

public class TestArrayWithRange {
	
	int findMin(int[] arr,int i,int j){
		int min=-1;
		if(i>=0 && j<arr.length){
		min=arr[i];
		for(int k=i+1;k<=j;k++){
			if(arr[k]<min)
				min=arr[k];
		}
		}
		return min;
	}

	public static void main(String[] args) {

		TestArrayWithRange test = new TestArrayWithRange();
		int[] arr = {3,4,9,1,5,2,5,5,8,10};
		System.out.println(test.findMin(arr, 0, 2));
	}

}

package com.hackerrank;

import java.util.ArrayList;

public class MiniMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,3,5,4};
		
		int min=arr[0];
		int max=arr[0];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
			sum=sum+arr[i];
		}
		
		int minSum=sum-max;
		int maxSum=sum-min;
		System.out.println(sum);
		System.out.println(min);
		System.out.println(max);
		System.out.println(minSum);
		System.out.println(maxSum);

	}

}

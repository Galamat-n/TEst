package com.hackerrank;

public class staircase {

	public static void main(String[] args) {
//		1 2 3 4 5 6 7 
//		1 2 3 4 5 6 
//		1 2 3 4 5 
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 
//		1 2 3 4 5 6 
//		1 2 3 4 5 6 7
		
		for(int row=7;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		for(int i=2;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}

package com.hackerrank;

import java.util.LinkedHashSet;
import java.util.Set;

public class baurzhan {
	
	public static int getReminder(int a, int b) {
		int remainder=0;
		int num=0;
		
		for(int i=1;i<=a/b;i++) {
			num=b*i;
		}
		
		remainder=a-num;
		
		return remainder;
	}
	
	public static int getReminder2(int a, int b) {
		int remainder=0;
		int num=0;
		
		while(true) {
			a=a-b;
			if(a<b) {
				remainder=a;
				break;
			}
		}
		
		return remainder;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int rema=getReminder2(23, 6);
//		
//		System.out.println(rema);
		
//		String s="asddsva";
//		String st1=s.substring(0,s.length()/2);
//		String st=s.substring(s.length()/2);
//		System.out.println(st);
//		String str="";
//		for(int i=st.length()-1;i>=0;i--) {
//			str=str+st.charAt(i);
//		}
//		
//		boolean bol=st1.equalsIgnoreCase(str);
//		System.out.println(bol);
		
//		int[] arr= {4,3,1,3,4,5,6,5,9,0};
//		Set<Integer> set=new LinkedHashSet<>();
//		for(int i=0; i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					set.add(arr[i]);
//				}
//			}
//		}
//		
//		System.out.println(set);
		
		//Fibbonacci
		
		int a,b,c;
		a=0;
		b=1;
		
		for(int i=1;i<=10;i++) {
			System.out.println(a+" ");
			c=a+b;//
			a=b;//
			b=c;//
		}
		

	}

}

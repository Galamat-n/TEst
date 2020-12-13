package com.hackerrank;

public class birthdayCake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candles= {3,2,1,3};
		
		int largest=0;
	    int count=0;
	    for(Integer candle:candles){
	        if(candle>largest){
	            largest=candle;
	            count=1;
	        }else if(candle==largest){
	            count++;
	        }
	    }
	    
	    System.out.println(count);

	}

}

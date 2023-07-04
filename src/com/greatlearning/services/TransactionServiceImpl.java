package com.greatlearning.services;

public class TransactionServiceImpl {

	public void search(long arr[], long target) {
		boolean flag = false;
		int arrLength = arr.length;
		long sum=0;
		for(int i=0;i<arrLength;i++) {
			sum += arr[i];
			if(sum>= target) {
				flag = true;
				System.out.println("Target has been achieved in " + (i+1) + " iterations");
				break;
			}
		}
		if(!flag) {
			System.out.println("Target has not been achieved");
		}
	}
	
}

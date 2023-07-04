package com.greatlearning.driver;
import java.util.Scanner;
import com.greatlearning.services.TransactionServiceImpl;
public class Main {

	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the size of transaction array");
		int size = scanner.nextInt();
		long arr[] = new long[size];
		System.out.println("Enter the values for the array");
		for(int i=0;i<size;i++) {
			arr[i] = scanner.nextLong();
		}
		System.out.println("Enter the total number of targets to be achieved");
		int targetno = scanner.nextInt();
		long target;
		TransactionServiceImpl tsimplementation = new TransactionServiceImpl();
		for(int i=0;i<targetno;i++) {
			System.out.println("Enter the target to be achieved:");
			target = scanner.nextInt();
			tsimplementation.search(arr, target);
		}
		scanner.close();
	}

}

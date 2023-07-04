package com.greatlearning.driver;
import java.util.Scanner;
import com.greatlearning.services.BubbleSortImpl;
import com.greatlearning.services.NotesCount;
public class Main2 {

	public static void main(String[] args) {
		System.out.println("Enter the size of currency denominations:");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the currency denominations values:");
		for(int i=0;i<size;i++) {
			notes[i] = scanner.nextInt();
		}
		System.out.println("Enter the amount you want to pay:");
		int amount = scanner.nextInt();
		BubbleSortImpl bubbleSortImpl = new BubbleSortImpl();
		bubbleSortImpl.bubbleSort(notes);
		NotesCount notesCount = new NotesCount();
		notesCount.notesCountImpl(notes, amount);
		scanner.close();
	}

}

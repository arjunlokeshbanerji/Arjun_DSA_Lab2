package com.greatlearning.services;

public class BubbleSortImpl {

	public void bubbleSort(int[] notes) {
		int size = notes.length;
		int temp;
		for(int i=0;i<size-1;i++) {
			for(int j=0; j<size-i-1;j++) {
				if(notes[j]<notes[j+1]) {
					temp = notes[j];
					notes[j] = notes[j+1];
					notes[j+1] = temp;
				}
			}
		}
	}

}

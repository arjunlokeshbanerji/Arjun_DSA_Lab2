package com.greatlearning.services;

public class NotesCount {

	public void notesCountImpl(int[] notes, int amount) {
		int[] noteCounter = new int[notes.length];
		try {
			for(int i=0;i<notes.length;i++) {
				if(amount>=notes[i]) {
					noteCounter[i] = amount/notes[i];
					amount = amount - (noteCounter[i]*notes[i]);
				}
			}
			if(amount > 0) {
				System.out.println("Exact amount cannot be given with highest denomination.");
			}	else {
				System.out.println("Your payment approach in order to give minimum number of notes will be - ");
				for(int i=0;i<notes.length;i++) {
					if(noteCounter[i]!=0) {
						System.out.println(notes[i] + " : " + noteCounter[i]);
					}
				}
			}
		}	catch(ArithmeticException ae) {
			System.out.println(ae + " notes of denomination 0 are invalid.");
		}
	}

}

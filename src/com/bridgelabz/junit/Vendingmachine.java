package com.bridgelabz.junit;
import java.util.Scanner;
public class Vendingmachine {
      static int i=0, total = 0;
      public static int getRupeeNotesCount(int amount, int[] notes) {
	        int remainder = 0;
	        if(amount == 0) {
	            return 0;
	        }
	        else {
	            if(amount >= notes[i]) {
	                int calculateNotes = amount / notes[i];
	                remainder = amount % notes[i];
	                amount = remainder;
	                total = calculateNotes + total;
	                System.out.println(notes[i] + ".Rs notes "+calculateNotes);

	            }
	        }

	        i++;
	        return getRupeeNotesCount(amount, notes);
	    }

	    public static void main(String args[]) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the amount : ");

	        int amount = scanner.nextInt();

	        int[] notes = {1,2,5,10,50,100,500,1000};

	        getRupeeNotesCount(amount, notes);

	    }

	}
	


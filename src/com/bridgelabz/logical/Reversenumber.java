package com.bridgelabz.logical;
import java.util.Scanner;
public class Reversenumber {
	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);  //create object 

	        int num , reversed = 0;

	        System.out.print("Enter number to reverse it : ");

	        num = sc.nextInt();

	        
	        while(num != 0) {

	            int digit = num % 10;

	            reversed = reversed * 10 + digit;
	            
	            num /= 10;

	        }

	        System.out.println("Reversed Number: " + reversed);
	    }

	    }

	



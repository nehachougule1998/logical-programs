package com.bridgelabz.logical;
import java.util.Scanner;
public class Stopwatch {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);  

	        int start= sc.nextInt();

	        int stop= sc.nextInt();

	        if (start == 0) {

	            long a = System.currentTimeMillis(); 
	            
	        } else if (stop == 0) {

	            long b = System.currentTimeMillis();  //Returns the current time in milliseconds

	        } else {

	            System.out.println("enter 0 to start");

	        }

	        long differance = stop - start;

	        System.out.println("The difference between start and stop is " + differance);
	    }


	}
	


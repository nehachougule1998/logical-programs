package com.bridgelabz.logical;
import java.util.Scanner;
public class Primenumber {
	public static void main(String[] args) {
		
		int temp;             
	    boolean Prime=true;

	    Scanner scan= new Scanner(System.in);   

	    System.out.println("Enter any number:");

	   	    int num=scan.nextInt();
	        for(int i=2;i<num;i++) {

	        temp=num%i;
	        if(temp==0) {
            Prime=false;
	            break;
	        }
	    }

	        if(Prime)  //if prime is true then the num is prime num
	            System.out.println(num + " is a Prime Number");
	        else
	                System.out.println(num + " is not a Prime Number");
	}

	}
	


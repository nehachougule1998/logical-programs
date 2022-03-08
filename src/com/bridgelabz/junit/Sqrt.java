package com.bridgelabz.junit;
import java.util.Scanner;
public class Sqrt {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);    

	        System.out.print("Enter non negative number : ");

	        int c = sc.nextInt();

	        int t = c;

	         while (Math.abs(t-(c/t))> Math.pow(1,-15)){  //where episilon=1e-15

	            t = ((c/t)+ t)/2;

	        }

	        System.out.println("the square root of given number is : " + t);
	    }
	}
	
	


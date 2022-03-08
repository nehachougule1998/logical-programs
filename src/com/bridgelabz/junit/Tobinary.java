package com.bridgelabz.junit;
import java.util.Scanner;
public class Tobinary {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number : ");
				int a = sc.nextInt();
				tobinary(a);
            	}
			    static void tobinary(int n) {
		    	if(n == 0) {
		    		return;
		    	}
		        int remainder = n%2;
		        n = n/2;
		        tobinary(n);
		        System.out.printf("%d",remainder);
			}
	   }
		
		
		

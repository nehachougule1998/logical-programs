package com.bridgelabz.junit;
import java.util.Scanner;
public class Montlypayment {

	public static void main(String[] args) {
		        System.out.print("Enter your principle loan amount : ");
		        Scanner sc = new Scanner(System.in); 
		        int pLoanAmount = sc.nextInt();
		        
		        System.out.print("Enter years to pay off : ");
		        int yeartopayoff = sc.nextInt();
		        
		        System.out.print("Enter interest on loan amount : ");
		        double interestLoan = sc.nextInt();
		        
		        double r = interestLoan/(12*100);
		        int n = 12*yeartopayoff;
		        double payment = pLoanAmount *r/(1-(Math.pow((1+r),-n)));
                System.out.println("Payment of load per month is : " + payment);

		    }
		}
				


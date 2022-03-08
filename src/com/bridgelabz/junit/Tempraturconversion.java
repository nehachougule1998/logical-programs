package com.bridgelabz.junit;
import java.util.Scanner;
public class Tempraturconversion {

	public static void main(String[] args) {
		        System.out.println("Welcome to temperature conversion .");
		        System.out.println("For Degree Celsius to Fahrenheit Enter 1 ");
		        System.out.println("For Fahrenheit to Degree Celsius Enter 2 ");
		        System.out.print("Enter conversion you want : ");
		        
		        Scanner sc = new Scanner(System.in);
		        int conversion = sc.nextInt();
		        if (conversion == 1){
		            System.out.print("Enter temperature in degree celsius: ");
		            double temp = sc.nextDouble();
		            double fer = temp*(9/5f)+32;
		            System.out.print("Temperature is :  " + fer +" Fahrenheit");

		        }
		        else {
		            System.out.print("Enter temperature in Fahrenheit :  ");
		            double temp = sc.nextDouble();
		            double Cel = (temp-32)*(5/9f);
		            System.out.print("Temperature is :  " + Cel +" Degree Celsius");

		        }
		    }
		}

		
		


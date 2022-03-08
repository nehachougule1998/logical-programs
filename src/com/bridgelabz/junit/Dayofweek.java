package com.bridgelabz.junit;
import java.util.Scanner;
public class Dayofweek{
	 public static void main(String[] args) {
        System.out.println("For months Enter ");
        System.out.println("January-1  Feb-2 March-3 April-4 MAy-5 June-6 July-7 August-8 Sep-9 Oct-10 Nov-11 Dec-12");
        System.out.print("Enter month number as per instructions : ");

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.print("Enter date : ");

        int day = sc.nextInt();
        System.out.print("Enter year : ");
        int year = sc.nextInt();

        int y0 = year - (14 - month) / 12;
        int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        int m0 = (month) + ((12 * ((14 - month) / 12)) - 2);
        int d0 = (day + x + (31 * m0 / 12)) % 7;

        System.out.print("the day of week is : " + d0 +" : " );
        switch (d0) {
            case 0 : System.out.println("sunday");
            		 break;
            case 1 : System.out.println("monday");
                     break;
            case 2 : System.out.println("Tuesday");
                     break;
            case 3 : System.out.println("wednesday");
                     break;
            case 4 : System.out.println("Thursday");
                     break;
            case 5 : System.out.println("Friday");
                     break;
            case 6 : System.out.println("Saturday");
                     break;
        }

    }
}
     
	


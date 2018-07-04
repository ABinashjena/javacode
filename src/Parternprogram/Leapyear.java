package Parternprogram;

import java.util.Scanner;

public class Leapyear {

	
		public static boolean leap =false;
		public static int Year;
		public static void main(String... args)
		{
			//Leap year
			
			while(true)
			{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter a year to check leap or not");
			 Year=sc.nextInt();
			if(Year % 4==0 || Year%100==0 || Year%400==0)
			{
						leap=true;
			}
			
			if(!leap)
			{
			System.out.println(Year+ " yes its a Leap year");
			}
			else
			{
				System.out.println(Year+ " not  its not a Leap year");	
				}
			
			}

	}

}

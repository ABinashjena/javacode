package javalogic;

import java.util.Scanner;

public class Checkuserinputisnumber {
	
	public static boolean userInput(String input)
	{
		try {
	  Integer.parseInt(input);
		}
		catch(Exception e)
		{
			return false;
		}	
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Enter your mobile number");
	
		Scanner sc =new Scanner(System.in);
		String input = sc.next();
		
		if(userInput(input))
		 {
            System.out.println("Good!!! You have entered valid mobile number");
        }
        else
        {
            System.out.println("Sorry!!!! You have entered invalid mobile number. Try again...");
        }
		
		
		
		
		
	}

}

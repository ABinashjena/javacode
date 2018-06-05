package javalogic;

public abstract class Bank {
	
	
	int amnt=100;//non static variable
	final int rate=10;//final variable
	static int loanrate=5;//static variable
	
	// abstract method 
	public abstract void loan();
	
	//non abstract method
	public void credit()
	{
		System.out.println(" bank credit");
	}
	
	public void debit()
	{
		System.out.println(" bank debit");
	}
	

}

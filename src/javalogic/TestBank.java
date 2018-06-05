package javalogic;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCbank hb=new HDFCbank();
		
		hb.loan();
		hb.credit();
		hb.debit();
		hb.fund();//non overridden method like that we will get abstraction and this type of abstraction is called partialy abstraction
		
		Bank b=new HDFCbank();//dynamic polymerphism
		System.out.println("*************************************************");
		b.credit();
		b.loan();
		b.debit();
		/*
		 *  override HDFCbank lone
 bank credit
 bank debit
HDFCbank fund
*************************************************
 bank credit
override HDFCbank lone
 bank debit

		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	
	}

}

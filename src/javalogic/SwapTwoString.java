package javalogic;

public class SwapTwoString {

	public static void main(String[] args) {
		String a="Abinash";
		String b="jena";
		//without 3rd variable
//		a=a+b;//Abinashjena
//		b=a.substring(0, a.length()-b.length());
//		a=a.substring(b.length());
//		System.out.println(a);
//		System.out.println(b);
		//with 3rd variable
		String temp=a;
		a=b;
		b=temp;
		System.out.println("*******************************************");
		System.out.println(a);
		System.out.println(b);
		
		
		
	
		
		
		

	}

}

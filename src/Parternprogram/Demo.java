package Parternprogram;

import java.util.HashMap;
import java.util.HashSet;



public class Demo extends Demo1{
	
	
	public static Object Amst(int num)
	{
		int copy=num;
		int reminder;
		int temp=0;
		String s="Not a Amstrong";
		while(num>0)
		{

			reminder=num%10;
			temp=temp+(reminder*reminder*reminder);
			num=num/10;
		}
		if(copy==temp)
		return copy;
		return s;

	}
	
	public static Object palendrom(int num)
	{
		int copy=num;
		int reminder;
		int temp=0;
		String s="Not a palendrom";
		while(num>0)
		{
			reminder=num%10;
			temp=(temp*10)+reminder;
			num=num/10;
		}
		if(copy==temp)
		{
			return copy;
		}
		return s;
	}
	public static String Reverse(String Str)
	{
		char[] ch = Str.toCharArray();
		String s1="";
		for(int i=Str.length()-1;i>=0;i--)
		{
			s1=s1+ch[i];
		}
		return s1;
	}
	public static String swapstring(String a,String b)
	{
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		return a+" "+b;
		
	}
	public static String countcharacter(String s)
	{
		String abc="Not found";
		char[] ch = s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(Character c    :ch)
		{
			if(hm.get(c)!=null)
			{
				hm.put(c, hm.get(c)+1);
			}
			else {
			hm.put(c, 1);
			}
	
		}
		java.util.Iterator<Character> temp = hm.keySet().iterator();
		 while(temp.hasNext())
		 {
			 Character abi = temp.next();
			 if(abi=='f' )
			 {
				//System.out.println(abi + "  "+hm.get(abi)); 
				return abi + "  "+hm.get(abi);
			 }
			
			 
		 }
		return abc;

	}
	
	public static Object Duplicate(String s)
	{
		String temp="No duplicate found";
		char[] ch = s.toCharArray();
		HashSet hs=new HashSet();
		for(Character c   :ch)
		{
			
			if(hs.add(c)==false)
			{
				return c;
			}

		}
		return temp;
		
	}
	
	
	
	
	public static void main(String[] args) {
	
		//Amstrong no
		Demo d=new Demo();

    	System.out.println(Amst(154));
//		System.out.println(palendrom(12231));
//		System.out.println(Reverse("Abinash"));
//		System.out.println(swapstring("Abinash","Jena"));
//		System.out.println(countcharacter("abinash"));
//		System.out.println(Duplicate("abinbaash"));

	}
}


 

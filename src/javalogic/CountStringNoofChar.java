package javalogic;

import java.util.HashMap;
import java.util.Iterator;

public class CountStringNoofChar {

	public static void main(String[] args) {
		
		
		String s="abinashjena";
		char[] charact = s.toCharArray();
		HashMap<Character ,Integer> hm=new HashMap<Character ,Integer>();//we useing Character as key and Integer as valuse
		for(char c :charact)
		{
			if(hm.get(c)!=null)//here we checking is that character is present prev in hashmap or not if preseent
				               //then we adding +1 with there execting index
			{
				hm.put(c,hm.get(c)+1);
			}
			else {
			hm.put(c, 1);
			}
			 Iterator<Character> c1=hm.keySet().iterator();
			 while(c1.hasNext())
			 {
				 Character tempchar = c1.next();
				 
				 if(hm.get(tempchar)>1)
				 {
					 System.out.println(tempchar +"  no of times    "+ hm.get(tempchar));
				 }
			 }
			 
			
		}
		System.out.println(hm);//{a=3, b=1, s=1, e=1, h=1, i=1, j=1, n=2}

		
		

	}

}

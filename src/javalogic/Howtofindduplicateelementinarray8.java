package javalogic;


import java.util.HashSet;

import java.util.Set;

public class Howtofindduplicateelementinarray8 {

	public static void main(String[] args) {
		String s= "ABINASH JENA";
		      char[] chracter = s.toCharArray();   
		      Set setA = new HashSet();
		      for(char c:chracter)
		      {
		    	 boolean xxxx = setA.add(c);
		    	 if(xxxx==false)
		    	 {
		    		 System.out.println(c);//A
		    	 }
		      }
		     System.out.println(setA);//[A, B, S, H, I, N]
		     

	}

}

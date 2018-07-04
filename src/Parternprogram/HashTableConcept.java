package Parternprogram;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {

		HashMap<String ,Integer> h3=new HashMap<String,Integer>();
		h3.put("null",1 );
		System.out.println(h3);
		Hashtable<Character,Integer> h1=new Hashtable<Character,Integer>();
		Hashtable<Character,Integer> h2=new Hashtable<Character,Integer>();
		h1.put('A', 1);
		h1.put('b', 2);
		h1.put('c', 2);
		h1.put('d', 4);
		h1.put('e', 5);
		System.out.println(h1);
		//clonable
		h2=(Hashtable<Character,Integer>)h1.clone();
		System.out.println(h2);
		//delete object
		h1.clear();
		System.out.println(h1);
		System.out.println(h2);
		//get the hashcode of hashtable object
		System.out.println(h2.hashCode());//449
		
		
		

	}

}

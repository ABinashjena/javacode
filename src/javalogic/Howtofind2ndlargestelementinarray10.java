package javalogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Howtofind2ndlargestelementinarray10 {

	public static void main(String[] args) {
		Integer a[]= {1,3,5,8,0};
		List l=new ArrayList();
		for( int var: a)
		{
			l.add(var);
		}
		System.out.println(l);
		Integer cc = Collections.max(Arrays.asList(a));
		l.remove(cc);
		System.out.println(l);
		
		
	}
	
}

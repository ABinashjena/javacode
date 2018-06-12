package javalogic;

import java.util.ArrayList;
import java.util.List;

public class HowtofindLeadsinArray25 {

	public static void main(String[] args) {
	
		Integer i[]= {1,0,2,3,0,5};
		
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l2=new ArrayList<Integer>();
		for( int k:i)
		{
			l1.add(k);
		}
		for(int m=0;m<l1.size();m++)
		{
			
			for(int n=1;n<=l1.size();n++)
			{
				
			if(l1.get(m)>l1.get(n))	
			{
				l2.add(l1.get(m));
			}
				
			}
			System.out.println(l2);
			
		}
		
		
		
	}

}

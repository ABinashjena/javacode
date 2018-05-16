package javalogic;

import java.util.ArrayList;
import java.util.List;

public class Simillarnumberin2array {

	public static void main(String[] args) {
	List<Integer> l1= new ArrayList<Integer>();
	
	List<Integer> l2= new ArrayList<Integer>();
		int[] x= {1,2,3,4};
		for (int k : x)
		{
			l1.add(k);
			
		}
		//System.out.println(l1);
		
		int[] y= {1,2,3,0};
		for (int l: y)
		{
			l2.add(l);
		}
		
		for (int i=0;i<x.length;i++)
		{
			for(int j=0;j<y.length;j++)
			{
				if(x[i]== y[j])
				{
					l1.remove((Integer)x[i]);
				}	
		}
			
		}
		System.out.println(l1);
	}

}

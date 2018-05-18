package javalogic;

import java.util.ArrayList;
import java.util.List;

public class Howtofindsumofalldigitofanumber9 {

	public static void main(String[] args) {
		
		
		Integer in[]= {1,2,3,4,5,0};

		List<Integer> l= new ArrayList<Integer>();
		for(int i:in)
		{
			l.add(i);
		}
		System.out.println(l);
		int sum=0;
for(int var: l)
{		
	sum=sum+var;
}
	System.out.println(sum);	
	}

}

package javalogic;

import java.util.ArrayList;
import java.util.List;

public class Seperatezorofromarray {

	public static void main(String[] args) {
	
		List l1=new ArrayList();
		List l2=new ArrayList();
		Integer i[]= {1,0,2,3,0,5};
		int len = i.length;
		for(int j=0;j<len;j++)
		{
			
			if(i[j]==0)
			{
		l1.add(i[j]);
			}
			else
			{
				l2.add(i[j]);
			}
			
		}
		
		System.out.println(l1);//[0, 0]
		System.out.println(l2);//[1, 2, 3, 5]
		l1.addAll(l2);
		System.out.println(l1);//[0, 0, 1, 2, 3, 5]
	}

}

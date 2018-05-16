package javalogic;


import java.util.ArrayList;
import java.util.List;

public class PrintStringinindexwise {

	public static void main(String[] args) {
		String s= "abcdefgh";
		char[] charcter = s.toCharArray();
		
		List l=new ArrayList();
			for(char c:charcter)
			{
				l.add(c);
				
		
			}
		System.out.println(l.size());
		
		for(int i=0;i<l.size();i++)
		{
			if(i>l.size()-6)
			{
				System.out.print(charcter[i]);
			}
		}

	}

}

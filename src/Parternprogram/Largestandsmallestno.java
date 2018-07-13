package Parternprogram;

import java.util.Arrays;

public class Largestandsmallestno {

	public static void main(String[] args) {
		int a[]= {1,3,4,-100,-4,77,100};
		int largest=a[0];
		int smalest=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
			largest=a[i];
			}
			else if(a[i]>smalest)
			{
				smalest=a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(largest);
		System.out.println(smalest);

	}

}

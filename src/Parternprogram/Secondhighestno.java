package Parternprogram;

public class Secondhighestno {

	public static void main(String[] args) {
	
		int num[]= {10,2,4,51,9};
		int maxno=num[0];
		int secmax=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>maxno)
			{
				maxno=num[i];
				num[i]=secmax;
				
				
			}
			
		}
		System.out.println(maxno);
		
		

	}

}

package javalogic;

public class palendromnumber {

	public static void main(String[] args) {
		
		int num=121;
		int copy=num;
		int reminder;
		int temp=0;//10 / 30
		while(num>0)
		{
		reminder = num%10;                     //121-->1  12-->2
		 temp= (temp*10)+reminder;               //1-->12
		 num=num/10;                           //12	/1
	}
		if (temp==copy)
		System.out.println("palendrom");
		else
			System.out.println("not a palendrom");
	}

}

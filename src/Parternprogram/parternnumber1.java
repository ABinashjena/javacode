package Parternprogram;

public class parternnumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		
		for(i=1;i<=4;i++)
		{
		for(j=1;j<=7;j++)
		{
			if(j<=3+i&&j>=5-i)
			{
		System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println(" ");
	}
		
	}

}

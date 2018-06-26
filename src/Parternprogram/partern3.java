package Parternprogram;

public class partern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		int k=7;
		//int p=0;
		int n=1;
	
		for(i=1;i<=4;i++)
		{  
			
			int x=i<=4?k--:0;
			int y=i<=4? n++:0;
		for(j=1;j<=7;j++)
		{
			if(j<=x&&j>=y)
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

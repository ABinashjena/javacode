package Parternprogram;

public class Partren2 {

	public static void main(String[] args) {
		// dimond partern
		
		int i,j;
		int k=5;
        int o=5;
		for(i=1;i<=9;i++)
		{  
			
			int l=i<=5?k++:--k;
			int m=i<=5?o--:++o;
		for(j=1;j<=9;j++)
		{
			if(j<=l&&j>=m)
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

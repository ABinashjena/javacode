package javalogic;

public class fibonicserese {

	public static void main(String[] args) {
		
		int x=0;
		int y=1;
		int z;//1
		System.out.print(x+", ");
		for(int i=0;i<10;i++)
		{
			z=x+y;
			x=y;
			y=z;
			if(i!=9) {
				System.out.print(z+", ");
			}
			else
			{
				System.out.print(z);
			}
		}
		
	}

}

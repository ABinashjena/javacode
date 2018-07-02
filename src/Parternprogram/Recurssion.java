package Parternprogram;

public class Recurssion {
	public int  test1(int no) throws InterruptedException
	{
		
		if(no==0)
			return 1;
		else
		{
			return no*test1(no-1);
		}
	}

	
	public String test2(String s)
	{
		if(s.isEmpty())
		{
		return s;
		}
		return test2(s.substring(1))+s.charAt(0);
		
	}

	public static void main(String[] args) throws InterruptedException {
		Recurssion r=new Recurssion();
		Object ans = r.test1(5);
		System.out.println(ans);//120
		String rev = r.test2("abinash");
		System.out.println(rev);//hsaniba

	}

}

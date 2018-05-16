package javalogic;

public class ReverseaString {

	public static void main(String[] args) {
		String s="Abinash jena";
		StringBuffer sb= new StringBuffer(s);
		System.out.println(sb.reverse());
		System.out.println("************************************");
		char[] try1=s.toCharArray();
		System.out.println(try1);
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(try1[i]);
		}
		
	}

}

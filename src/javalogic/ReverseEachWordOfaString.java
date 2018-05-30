package javalogic;

public class ReverseEachWordOfaString {
	public static String temp;
	public static void main(String[] args) {
		
		String s= "Abinash Jena";
		String[] keyword =s.split(" ");//Keyword 1.Abinash 2.Jena
		for(int i = 0; i< keyword.length; i++)//lenth=2
		{
		 temp=keyword[i];//1.loop temp =Abinash /2.loop temp=Jena
		 StringBuffer sb =new StringBuffer(temp);//Abinash /Jena
		 System.out.print(sb.reverse()+" ");//hsanibA /aneJ
		}	
	}

}

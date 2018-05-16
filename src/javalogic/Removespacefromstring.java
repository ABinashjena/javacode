package javalogic;

public class Removespacefromstring {

	public static void main(String[] args) {
		
		String s="Abinash jena";
		String replace = s.replace(" ","");
		System.out.println(replace);
		System.out.println("**************2nd************************");
		String replace1 = s.replaceAll("\\s","");
		System.out.println(replace1);

	}

}

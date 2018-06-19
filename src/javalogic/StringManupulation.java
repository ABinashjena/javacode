package javalogic;

public class StringManupulation {

	public static void main(String[] args) {
		
		String s="abinash jena";
		String s1="Abinash jena";
		//find the length of the string?
		System.out.println(s.length());//12
		//find the 1st occurance of a?
		System.out.println(s.indexOf('a'));//0
		//find the 2nd occurance of a?
		int no=s.indexOf('a',s.indexOf('a')+1);
		System.out.println(s.indexOf('a',s.indexOf('a')+1));//4
		//find the 3rd occurance of a?
		System.out.println(s.indexOf('a',no+1));
		//find the  character of index 10?
		System.out.println(s.charAt(10));//n
		//compare the 2 string?
		System.out.println(s.equals(s1));//true
		//compare the 2 string if any string having case sensitive?
		System.out.println(s.equalsIgnoreCase(s1));//true
		//find the index of the word jena?
		System.out.println(s.indexOf("jena"));//8
		//check the word papu is present in string or not?
		System.out.println(s.indexOf("papu"));//-1 means not present
		//substring
		System.out.println(s.substring(0, 7));//abinash
		String s3="  hello world  ";
		System.out.println(s3.trim());//hello world trim() will only replace before and after space it will not replace the middle space
		System.out.println(s3.replace(" ", ""));//helloworld
		//split() function
		String s4="hello_world_test_slenium";
		
        String totalval[] = s4.split("_");
                  for(int i=0;i<totalval.length;i++)
                  {
                	  System.out.println(totalval[i]);
                  }
                  /*
                   hello
                   world
                   test
                   slenium
                   */
		
		
		

	}

}

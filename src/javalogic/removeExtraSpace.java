package javalogic;

import java.util.StringTokenizer;

public class removeExtraSpace {



		public static void main(String args[]){
	    	
//	        String input = "Try    to    remove   extra   spaces.";
//	        StringTokenizer substr = new StringTokenizer(input, "  ");
//	        StringBuffer sb = new StringBuffer();
//	        
//	        while(substr.hasMoreElements()){
//	            sb.append(substr.nextElement()).append(" ");
//	        }
//	        
//	        System.out.println("Actual string: " + input);
//	        System.out.println("Processed string: " + sb.toString().trim());
			
			String[] result = "this is a test".split("\\s");
		     for (int x=0; x<result.length; x++)
		         System.out.println(result[x]);
		 
	    }
	

	

}

package Parternprogram;


public  class countnoofvowels {
	  
	
	   public static void main(String... args)
	   {
		  String s="abinash";
		  char[] ch = s.toCharArray();
		  int count=0;
		  for(Character c   :ch)
		  {
			  switch(c) {
			  
			  case 'a':
			  case 'e':
			  case 'i':
			  case 'o':
			  case 'u':
				  count++;
				  break;
	          default:
			  }
			  }
		  
		  System.out.println(" "+count);  
		  }
		   
		   
	   }


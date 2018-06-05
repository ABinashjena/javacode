package javalogic;

public class factorial {

	public static void main(String[] args) {
		
		//1!=1*1,2!=1*2,3!=1*2*3
		

     int n=5;
     int fact=1;
   
    while(n>0)
    {
    	fact=fact*n;
    	n--;
    }
		System.out.println(fact);
		
		
	}

}

package Parternprogram;

public class Binarysearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,7,8,10};
		int search=8;
		int len=arr.length;
		int firstindex=10;
		int lastindex=len-1;
		int middle=(firstindex+lastindex)/2;
		while( firstindex <= lastindex )
	    {
			
			if(arr[middle]<search)
			{
				firstindex=middle+1;
		
			}
			else if(arr[middle]==search)
			{
				 
				System.out.println(search +" endex of   "+ (middle+1));
				break;
			}
			else 
			{
				lastindex=middle-1;
				middle=(firstindex+lastindex)/2;
			}
	    }
		if(firstindex>lastindex)
		{
			System.out.println(search +" no index found");
		}
		
		
			

	}

}

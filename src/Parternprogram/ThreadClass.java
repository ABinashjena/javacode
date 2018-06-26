package Parternprogram;


 
class DemoThread extends Thread
 {
	
	public void run() {
		
		
		for(int i=0;i<10;i++)
		{
		System.out.println(Thread.currentThread().getId()  +    "  value");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	              }
	
	
  }



public class ThreadClass {

	public static void main(String[] args) {
		DemoThread d=new DemoThread();
		d.start();
		DemoThread d1=new DemoThread();
		d1.start();
		
		

	}

	

}

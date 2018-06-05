package javalogic;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.start();//Bmw start
		b.stop();//Bmw stop
		b.refuel();//Bmw refuel
        b.thefsefty();//BMW thefsefty
        System.out.println("Dynamic polymerphism");
        Car c=new BMW();//Dynamic polymerphism or top cast child class object can be refer by parent class/interface reference variable is called dynamic polymerphism.
        c.start();
        c.stop();
        c.refuel();
        
		
		
		
		
	}

}

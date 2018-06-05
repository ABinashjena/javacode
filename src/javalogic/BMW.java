package javalogic;

public class BMW implements Car{

	@Override
	public void start() {
		System.out.println("Bmw start");
		
	}

	@Override
	public void stop() {
		System.out.println("Bmw stop");
		
	}

	@Override
	public void refuel() {
		System.out.println("Bmw refuel");
		
	}
	
	
	//non overriden method
	public void thefsefty()
	{
		System.out.println("BMW thefsefty");
	}
	

}

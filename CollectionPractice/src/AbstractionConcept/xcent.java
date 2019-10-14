package AbstractionConcept;

public class xcent implements Car {
	
	public void start()
	{
		System.out.println("Start method");
	}

	@Override
	public void refule() {
		// TODO Auto-generated method stub
		
		System.out.println("Refule method interface");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop metod interface");
		
	
	}
	
	public void wihtouabstract()
	{
		System.out.println("Wihtout abstract");
	}
	

}

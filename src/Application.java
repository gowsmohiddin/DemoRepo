import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


public class Application {
	
	
	public static void main(String[] args) {
		createCAR();
		createSUV();
		
}
	
	private static void createCAR()
	{
	List <Wheel> wheels = new ArrayList<Wheel>();
	
	for (int i=0; i<4 ;i++)
	{
	 	wheels.add(new Wheel(4,4,Wheel.BRAND.APPOLLO));
	}
	Car c1 = new Car (Color.blue, (short)4,new Engine(Engine.TYPE.PETROL),wheels);
	
	c1.getColor();
	c1.getCapacity();
	c1.setColor(Color.MAGENTA);
	c1.start();
	c1.getWheels().add(0,new Wheel(5,5,Wheel.BRAND.MRF));
	
	}
	

		private static void createSUV()
		{
		List <Wheel> wheels = new ArrayList<Wheel>();
		
		for (int i=0; i<4 ;i++)
		{
		 	wheels.add(new Wheel(4,4,Wheel.BRAND.APPOLLO));
		}
		Car c1 = new SUV (true, Color.blue, (short)4,new Engine(Engine.TYPE.PETROL),wheels);
		
		c1.getColor();
		c1.getCapacity();
		c1.setColor(Color.MAGENTA);
		c1.start();
		c1.getWheels().add(0,new Wheel(5,5,Wheel.BRAND.MRF));
		
		}
		
		
}

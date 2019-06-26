import java.awt.Color;
import java.util.List;

public class Car {
	
	private Color color;
	private short capacity; //Pass capacity
	private Engine engine;
	private List<Wheel> wheels;
	
	
	public Car(Color color, short capacity, Engine engine, List<Wheel> wheels) {
		super();
		this.color = color;
		this.capacity = capacity;
		this.engine = engine;
		this.wheels = wheels;
	}
	
	public List<Wheel> getWheels() {
		return wheels;
	}

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public short getCapacity() {
		return capacity;

	}
	
	public void start ()
	{
		engine.start();
		System.out.println("Car started.....");
	}

}

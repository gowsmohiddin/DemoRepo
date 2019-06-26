import java.awt.Color;
import java.util.List;

public class SUV extends Car{
	
	private boolean sunroof;

	public boolean isSunroof() {
		return sunroof;
	}

	public SUV(boolean sunroof, Color color,short capacity, Engine engine, List<Wheel> wheels) {
		super(color, capacity, engine, wheels);
		this.sunroof = sunroof;
	}
	
	

}

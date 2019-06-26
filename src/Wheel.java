
public class Wheel {

	 private float diameter;
	 private float width;
	 private BRAND brand;
	 
	 public enum BRAND {
		 
		 MRF, APPOLLO;

	 }

	public Wheel(float diameter, float width, BRAND brand) {
		super();
		this.diameter = diameter;
		this.width = width;
		this.brand = brand;
	}

	public float getDiameter() {
		return diameter;
	}

	public float getWidth() {
		return width;
	}

	public BRAND getBrand() {
		return brand;
	}
	 
	
	 

	 
}

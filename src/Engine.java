
public class Engine {
	

	public enum TYPE {
		PETROL, DIESEL;

	}
	
	TYPE type;
	
	public void start()
	{
		System.out.println("Engine started...");
	}
	
	public Engine(TYPE type) {
		super();
		this.type = type;
	}

	

}

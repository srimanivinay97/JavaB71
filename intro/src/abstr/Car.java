package abstr;
//all methods of an interface are automatically public. no need to write keyword public.
public interface Car {
	
	public abstract void exhaust();
	
	void colour();
	
	void speed();
	
	void mileage();
	
	default void ev() {
		System.out.println("it is not ev");
		keyless();
	};
	public default void price() {
		System.out.println("NA");
		keyless();
	}
	static void gift() {
		System.out.println("no gifts");
		//keyless();
	}
	private void keyless() {
	System.out.println("mundhu java medha focus chei");
	}
} 

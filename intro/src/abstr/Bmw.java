package abstr;

public class Bmw implements Car {

	
	public void exhaust() {
System.out.println("bmw exaust is Roaring");		
	}

	
	public void colour() {
		System.out.println("bmw colour is grey");
		
	}

	@Override
	public void speed() {
		System.out.println("bmw can go at 300kmph");
		
	}

	@Override
	public void mileage() {
		System.out.println("bmw mileage is 10");
		
	}

}

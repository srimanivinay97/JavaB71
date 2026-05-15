package abstr;

public class Audi implements Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exhaust() {
		System.out.println("audi's exhaust is smooth");
		
	}

	@Override
	public void colour() {
		System.out.println("audi's colour is black");
		
	}

	@Override
	public void speed() {
		System.out.println("audi's speed is 250kmph");
		
	}

	@Override
	public void mileage() {
		System.out.println("audi's mileage is 12");
		
	}

}
package abstr;

public class Cartest extends Singer{

	public static void main(String[] args) {
		Car b=new Bmw();
		
		b.exhaust();
		b.colour();
		b.ev();
		Car.gift();
		
		Car a=new Audi();
		a.speed();
		a.ev();
		a.price();
		
		Car t=new Tesla();
		t.ev();
		t.price();
		//t.keyless();
		Abclass ab=new Singer();
		ab.sing();
		ab.play();
	}

}

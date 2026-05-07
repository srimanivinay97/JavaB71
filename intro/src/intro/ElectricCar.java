package intro;
class Vehicle{
	String brand;
	Vehicle(String brand){
		this.brand=brand;
		IO.println("Brand : "+brand);
	}
}
class Car extends Vehicle{
	int price;
	Car(int price,String brand){
		super(brand);
		this.price=price;
		IO.println("Price: "+price);
	}	
}
public class ElectricCar extends Car{
	String battery;
	ElectricCar(String battery){
		super(50_00_000,"BMW");
		this.battery=battery;
		IO.println("Battery: "+battery);
	}
	
	public static void main() {
		new ElectricCar("50000 mah");
	}
}

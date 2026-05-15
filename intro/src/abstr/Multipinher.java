package abstr;
interface in1{
	void method1();
	void method2();
	static void method4() {
		System.out.println("in in1 static");
	}
}
interface in2{
	void method2();
	void method3();
}
interface in3 extends in1,in2{
	
}
class mpin implements in3{

	@Override
	public void method2() {
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
	
}




public class Multipinher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

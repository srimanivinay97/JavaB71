package Accessmodifierpac2;

import Accessmodifierpac1.Accmod1;

public class Accmodpactwo1 extends Accmod1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accmod1 a1=new Accmod1();
		IO.println(a1.i2);
		IO.println(a1.name2);
		IO.println("**************************");
		Accmodpactwo1 a2=new Accmodpactwo1();
		IO.println(a2.i3);
		IO.println(a2.name3);
		a2.method3();
		
	}

}

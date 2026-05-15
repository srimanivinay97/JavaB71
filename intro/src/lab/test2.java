package lab;

import abstr.Bmw;
import abstr.Car;

public class test2 {
	static boolean pn() {
		int a=27;
		int b=0;
		boolean status=false;
		for(int i=1;i<=a/2;i++) {
			if(a%i==0) {
				b+=i;
				if(b>a) {
					break;
				}
			}
			
			}
		if(b==a) {
			status=true;}
		return status;
		}
	public static void main() {
		Car c=new Bmw();
		c.colour();
		for(int i=10;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		if(pn()) {
			System.out.println("it is a perfect number");
		}
		else {
			System.out.println("it is not perfect number");
		}
}}


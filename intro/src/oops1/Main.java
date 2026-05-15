package oops1;

import java.util.Scanner;

class Account{
	
	static Scanner sc=new Scanner(System.in);
	double p=sc.nextDouble();
	static {
		System.out.println("enter tenure ");
	}
	double t=sc.nextInt();
	
	void calInt() {
		double r=8.0F;
		double cal=(p*t*r)/100;
	}
}
class SavingsAccount extends Account{
	@Override
	void calInt() {
		super.calInt();
		double r=6.0F;
		double cal=(p*t*r)/100;
		System.out.println("Savings Account Interest rate for "+p+" in "+t+"years is "+cal);
	}	
}
class CurrentAccount extends SavingsAccount {
	@Override
		void calInt() {
			super.calInt();
			double r=2.0F;
			double cal=(p*t*r)/100;
			System.out.println("Current Account Interest rate for "+p+" in "+t+"years is "+cal);
		}	
	}

public class Main {
	
	public static void main() {
		System.out.println("enter principle ");
		Account a=new CurrentAccount();
		a.calInt();
	 }
	}

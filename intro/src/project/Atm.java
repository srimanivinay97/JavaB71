package project;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		Atmuser q=null;
		Atmuser u[]=new Atmuser[4];
		u[0]=new Atmuser(12345,1234,"vinay",5000);
		u[1]=new Atmuser(12346,1235,"ravi",5000);
		u[2]=new Atmuser(12347,1236,"raghu",5000);
		u[3]=new Atmuser(12348,1237,"mani",5000);
		System.out.println("enter account number ");
		int a=sc.nextInt();
		System.out.println("enter pin number ");
		int b=sc.nextInt();
		for(Atmuser u1:u) {
			if(u1.accno==a && u1.pin==b) {
				
				break;
			}
		}
		while(!exit) {
			System.out.println("1.show balance");
			System.out.println("2.withdraw amount");
			System.out.println("3.deposit amount");
			System.out.println("4.change pin");
			System.out.println("5.exit");
			int uin=sc.nextInt();
			switch(uin) {
			case 1->System.out.println("");
			case 2->System.out.println("");
			case 3->System.out.println("");
			case 4->System.out.println("");
			case 5->{exit=true;
			System.out.println("thank you for using SBI ATM");}
			default->System.out.println("please enter valid input.");
			
			}
			
		}
		sc.close();
	}

}

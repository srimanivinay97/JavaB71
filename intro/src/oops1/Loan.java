package oops1;
import java.util.Scanner;

public class Loan {
	static Scanner sc=new Scanner(System.in);
	String getcustomeraddress() {
		String address=null;
		IO.println("enter your flat.no ");
		String flat=sc.next();
		IO.println("enter your plot.no ");
		String plot=sc.next();
		IO.println("enter your street name ");
		String street=sc.next();
		IO.println("enter your city name ");
		String city=sc.next();
		IO.println("enter your pincode ");
		String pin=sc.next();
		address="flat no "+flat+" Plot no "+plot+" street name "+street+" city name "+city+" pincode "+pin;
		return address;
	}
	int getCustomerage() {
		IO.println("enter your age");
		int age=sc.nextInt();
		return age;
	}
	double getCustomersalary() {
		IO.println("enter your salary ");
		double salary=sc.nextDouble();
		return salary;
	}
	int getCustomercibil() {
		IO.println("enter your cibil score ");
		int cibil=sc.nextInt();
		return cibil;
	}
}

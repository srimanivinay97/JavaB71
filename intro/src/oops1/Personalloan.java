package oops1;

public class Personalloan extends Loan{

	public static void main(String[] args) {
		Personalloan p1=new Personalloan();
		int age=p1.getCustomerage();
		double salary=p1.getCustomersalary();
		int cibil=p1.getCustomercibil();
		if (age>=25 && salary>1_00_000 && cibil>750) {
			IO.println("your loan is approved");
		}
		else {
			IO.println("your loan is rejected");
		}
	}

}

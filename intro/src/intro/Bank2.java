package intro;

import java.util.Scanner;
public class Bank2 {
	static double balance=10_000;
	static void showBalance(){
		System.out.println(balance);
	}
	static void deposit(double amount){
		balance+=amount;
	}
	static void withdraw(double amount) {
		if(amount<=balance) {
			balance+=amount;
		}
		else {
			IO.println("insufficient balance");
		}
		
	}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String f = "a";
			while(!f.equals("exit")) {
				IO.println("Enter your choice ");
				IO.println("Balance ");
				IO.println("Deposit ");
				IO.println("Withdraw ");
				IO.println("exit");
				f=sc.next();
				if(f.equals("Balance")) {
					showBalance();
					
				}
				if(f.equals("Deposit")) {
					IO.println("Enter Deposit ");
				double	g=sc.nextDouble();
					deposit(g);
					
				}
				if(f.equals("Withdraw")) {
					IO.println("Enter Withdraw");
					double h=sc.nextDouble();
					withdraw(h);
					
				}
			}
			IO.println("END");
			sc.close();
	}

	
}

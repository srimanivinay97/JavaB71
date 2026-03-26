package intro;

public class Bank {
	int accountnumber=1;
	String AccountHolderName;
	
	static double Balance;
	static String Bank;
	static String Branch;
	void Showbalance() {
		System.out.println(AccountHolderName+"\n"+accountnumber+"\n"+"available balance is "+Balance);
	}
	void Deposit(double amount) {
		Balance+=amount;
		System.out.println(amount+" Deposited into account.no "+accountnumber+" AccountHolderName "+AccountHolderName);
	}
	public static void main(String[] args) {
		
		Bank Account1=new Bank();
		Account1.accountnumber=12345678;
		Account1.AccountHolderName="Vinay";
		Balance=1000;
		Bank= "SBI";
		Branch="Gachibowli";
		
		//2nd Account Holder
		
		Bank Account2=new Bank();
		Account2.accountnumber=1230987654;
		Account2.AccountHolderName="Mani";
		Balance=5000;
		
		//3rd Account Holder
		
		Bank Account3=new Bank();
		
		Account3.AccountHolderName="Sri";
		Balance=500;
		
		//Deposit into account3
		
		System.out.println(Account3.accountnumber);
	}

}

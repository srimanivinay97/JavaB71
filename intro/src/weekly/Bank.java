package weekly;
class account{
account(){
}
	//encapsulation class;
	private long AccountNumber=227492103781L;
	private String AccountName="sri mani vinay";
	protected double balance;
	protected double interestrate;
	account(double balance,double interestrate){
		this.balance+=balance;
		this.interestrate+=interestrate;
	}
	public void deposit(double amount) {
		this.balance+=amount;
		System.out.println("Deposited amount is "+amount);
	}
	public void withdrawl(double amount) {
		this.balance-=amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setInterestrate(double interestrate) {
		this.interestrate=interestrate;
	}
	public double getInterestrate() {
		return interestrate;
	}
}
class savingsaccount extends account{
		savingsaccount(double balance){
			super(balance,3.5);
			System.out.println("Savings account balance is "+balance);
		}
		@Override
		public void withdrawl(double amount) {
			if (balance<amount ) {
				System.out.println("Balance Low");
			}
			else {
				this.balance-=amount;
				System.out.println("Available Balance is "+balance);
			}
		}
}
class fixedDepositaccount extends account{
	fixedDepositaccount(double amount){
		super(amount,7.0);
		System.out.println("fixed deposit account balance "+balance);
	}
	@Override
	public void withdrawl(double amount) {
		double penality=amount*0.05;
		balance-=(amount+penality);
		System.out.println("fixed deposite withdrawl with 5% penality "+(amount+penality));
		System.out.println("balance available "+balance);
	}
}
public class Bank {
	public static void main(String[] args) {
		savingsaccount sa=new savingsaccount(5000);
		fixedDepositaccount fa=new fixedDepositaccount(6000);
		sa.withdrawl(6000);
		fa.withdrawl(3000);
		}
}

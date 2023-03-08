package Details;

abstract public class Account {
	protected int accNumber;
	protected double balance;
	protected Customer customerObj;
	public Account(int accNumber, double balance, Customer customerObj) {
		super();
		this.accNumber = accNumber;
		this.balance = balance;
		this.customerObj = customerObj;
	}
	abstract public boolean withdraw(double amount);
	
		
	
}

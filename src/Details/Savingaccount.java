package Details;

public class Savingaccount extends Account {
   private double minimumbalance;

public Savingaccount(int accNumber, double balance, Customer customerObj, double minimumbalance) {
	super(accNumber, balance, customerObj);
	this.minimumbalance = minimumbalance;
}
public boolean withdraw(double amount)
{
	if(balance-amount>minimumbalance)
	{
		balance= balance-amount;
		return true;
	}
	else
	{
		return false;
	}
	
}

}

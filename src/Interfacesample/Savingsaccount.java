package Interfacesample;

public class Savingsaccount extends Account implements Maintenancecharge {

	public Savingsaccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		
	}
	@Override
	public float calculateMaintenancecharge(float noofyears) {
		return ((50* noofyears )+50);
		
	}

	

	
}

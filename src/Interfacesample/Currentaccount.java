package Interfacesample;

public class Currentaccount extends Account implements Maintenancecharge {

	public Currentaccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		
	}
	@Override
	public float calculateMaintenancecharge(float noofyears) {
		return ((100* noofyears )+200);
		
	}

	
}

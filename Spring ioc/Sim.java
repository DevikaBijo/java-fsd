package ustbatchno3.Spring_ioc;

public interface Sim {
	public void calling(); 
	
	public void dialling();

}
class Jio implements Sim{

	public void calling() {
		System.out.println("Im calling from the jio sim");
		
	}

	public void dialling() {
		System.out.println("Im dialling from the jio sim");
		
	}
	
}

class Airtel implements Sim{
	public void calling() {
	 System.out.println("Im calling from the airtel  sim");
	
}

    public void dialling() {
	 System.out.println("Im dialling from the airtel sim");
	
}
}
class vi implements Sim{
	 public void calling() {
	 System.out.println("Im calling from the vi  sim");
	
}

    public void dialling() {
	 System.out.println("Im dialling from the vi sim");
	
}
}

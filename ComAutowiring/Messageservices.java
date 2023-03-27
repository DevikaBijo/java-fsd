package ustbatchno3.Com.Autowiring;

public interface Messageservices {

	 public void sendmessages(String message);
	 
}
class Emailservices implements Messageservices{

	public void sendmessages(String message) {
		
		System.out.println("Im  from emailservices " +message);
	}
	
	
}
class Smsservices implements Messageservices{

	public void sendmessages(String message) {
		
		System.out.println("Im from smsservices "+message);
	}
	
	
}
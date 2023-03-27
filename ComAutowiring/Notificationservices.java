package ustbatchno3.Com.Autowiring;

public class Notificationservices {

  private Messageservices messageservices;
  
  public void notifyservices() {
		messageservices.sendmessages("hi im notified");
	}

public void setMessageservices(Messageservices messageservices) {
	this.messageservices = messageservices;
}
	

}

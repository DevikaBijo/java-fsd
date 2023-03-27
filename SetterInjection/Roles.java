package ustbatchno3.SetterInjection;

public class Roles {

	public String Charactername;
	public String Responsibility;
	public String getCharactername() {
		return Charactername;
	}
	public void setCharactername(String charactername) {
		Charactername = charactername;
	}
	public String getResponsibility() {
		return Responsibility;
	}
	public void setResponsibility(String responsibility) {
		Responsibility = responsibility;
	}
	@Override
	public String toString() {
		return "Roles [Charactername=" + Charactername + ", Responsibility=" + Responsibility + "]";
	}
	public void display() {
		System.out.println("My name is " +Charactername + " " + "and my responsilibilty is " +Responsibility ); 
	}

}

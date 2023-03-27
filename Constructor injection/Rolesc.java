package ustbatchno3.ConstructorInjection;

public class Rolesc {
	public String charactername;
	public String responsibility;
	
	public Rolesc(String charactername, String responsibility) {
		
		this.charactername = charactername;
		this.responsibility = responsibility;
	}
	
	

	public void display() {
		System.out.println("My name is " +charactername + " " + "and my responsilibilty is " +responsibility ); 
	}

}
	


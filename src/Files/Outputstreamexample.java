package Files;
import java.io.*;

public class Outputstreamexample {

	public static void main(String[] args) {
		
		try {
		      FileOutputStream fout = new  FileOutputStream("D:\\testout.txt");
		      String data ="this is a line of test inside the file";
		      byte b[]=data.getBytes();
		      fout.write(b);
		      fout.close();
		      
		    }catch(Exception e){
		    	System.out.println(e);
		    }
		    	
		
		

	}

}

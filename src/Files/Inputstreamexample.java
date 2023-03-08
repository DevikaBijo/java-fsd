package Files;

import java.io.FileInputStream;

public class Inputstreamexample {

	public static void main(String[] args) {
		try
		{
			FileInputStream fin = new FileInputStream("D:\\testout.txt");
			int i= fin.read();
			System.out.println((char)i);
			fin.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

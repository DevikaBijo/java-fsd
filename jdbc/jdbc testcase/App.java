package ustbatchno3.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import com.mysql.cj.xdevapi.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try{  
    		Class.forName("com.mysql.jdbc.Driver");  
    		Connection con=DriverManager.getConnection(  
    		"jdbc:mysql://localhost:3306/devika","root","pass@word1");  
    		//here sonoo is database name, root is username and password  
    		Statement stmt= con.createStatement();  
    		ResultSet rs=stmt.executeQuery("select * from cars");  
    		while(rs.next())  
    		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
    		con.close();  
    		}catch(Exception e){ System.out.println(e);}  
    		}  
    }


package ustbatchno3.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    			new ClassPathXmlApplicationContext("application.xml"); 
    			Roles r= context.getBean("demo" ,Roles.class);
    			r.display();
    			Roles r2= context.getBean("demo2" ,Roles.class);
    			r2.display();
    			Roles r3= context.getBean("demo3" ,Roles.class);
    			r3.display();
    			
    }
    
}

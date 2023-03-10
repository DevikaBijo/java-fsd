package ustbatchno3.junit5testcase;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class Testvehicle {
	@Test
    public void testValidVehicleNumber() {
		
		String vehicleNumber ="KL38F5143";
	    Vehicle vh= new  Vehicle (vehicleNumber); 
	    String state =  vh.getState();
        String district =vh.getDistrict();
        assertEquals("Kerala", state);
        assertEquals("idukki", district);
    }
	    
	}



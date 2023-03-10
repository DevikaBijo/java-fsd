package ustbatchno3.junit5testcase;

import java.util.HashMap;
import java.util.Map;

public class Vehicle {

	
	private static String vehicleNumber="KL38F5143";

	public Vehicle(String vehicleNumber) {
		super();
		this.vehicleNumber = vehicleNumber;
	} 
	 public static String getState() {
	        String stateCode = vehicleNumber.substring(0,2);
	        Map<String, String> stateMap = new HashMap<>();
	        stateMap.put("KL", "Kerala");
	        stateMap.put("KA", "Karnataka");
	        return stateMap.get(stateCode);
    }
	 
	 public static String getDistrict() {
	        String districtCode = vehicleNumber.substring(2, 4);
	        Map<String, String> districtMap = new HashMap<>();
	        districtMap.put("38", "idukki");
	        districtMap.put("40", "ekm");
	        return districtMap.get(districtCode);
	    }
}

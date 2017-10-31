package org.rest.Disney.SampleCode.ExampleRESTfulService.vehicle.database;

import java.util.HashMap;
import java.util.Map;

import org.rest.Disney.SampleCode.ExampleRESTfulService.model.Vehicle;

public class DatabaseClass {

	/*Make a 'virtual' Database using Map, which is static to make the database consistent. 
	Note: This is not a Threadsafe. There is no concurrency protection over here. I am just assuming
	there is only one developer currently Myself who is developing this. */ 
	
	private static Map<Integer, Vehicle> vehicles = new HashMap<Integer, Vehicle>(); 
	
	public static Map<Integer, Vehicle> getVehicles(){
		return vehicles; 
	}
}

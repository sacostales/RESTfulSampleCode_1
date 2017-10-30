package org.rest.mitchell.vehicle.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.rest.mitchell.vehicle.database.DatabaseClass;
import org.rest.mitchell.vehicle.model.Vehicle;

//Service class listed all the services used by resource Vehicle
public class VehicleService {

	private Map<Integer, Vehicle> vehicles = DatabaseClass.getVehicles();
	
	public VehicleService(){
		
			}
	
	public List<Vehicle> getAllVehicles(){
		return new ArrayList<Vehicle>(vehicles.values());
	}
	
	public List<Vehicle> getAllVehiclesByMake(String make){
		List<Vehicle> vehiclesbymake = new ArrayList<Vehicle>();
		for(Vehicle vehicle: vehicles.values()) {
			if(vehicle.getMake().equals( make)){
				vehiclesbymake.add(vehicle);
			}
		}
		return vehiclesbymake;
	}
	
	public List<Vehicle> getAllVehiclesByModel(String model){
		List<Vehicle> vehiclesbymodel = new ArrayList<Vehicle>();
		for(Vehicle vehicle: vehicles.values()) {
			if(vehicle.getModel().equals( model)){
				vehiclesbymodel.add(vehicle);
			}
		}
		return vehiclesbymodel;
	}
	
	public List<Vehicle> getAllVehiclesByMakeAndModel(String make, String model){
		List<Vehicle> vehiclesbymakemodel = new ArrayList<Vehicle>();
		for(Vehicle vehicle: vehicles.values()) {
			if(vehicle.getMake().equals(make) && vehicle.getModel().equals( model)){
				vehiclesbymakemodel.add(vehicle);
			}
		}
		return vehiclesbymakemodel;
	}
	
	public Vehicle getVehicle(int id){
		return vehicles.get(id);
	}

	public Vehicle addVehicle(Vehicle vehicle){
		//POST request validation
		if(vehicle.getMake() != "" && vehicle.getModel() != "" && (vehicle.getYear() > 1950 && vehicle.getYear() < 2050 )){
		vehicle.setId(vehicles.size() + 1);
		vehicles.put(vehicle.getId(), vehicle);
		return vehicle;
		}
		return null;
	}
	
	public Vehicle updateVehicle(Vehicle vehicle){
		if(vehicle.getId() <= 0){
			 return null;
		}
		vehicles.put(vehicle.getId(), vehicle);
		return vehicle;
	}
	
	public Vehicle removeVehicle(int id){
		return vehicles.remove(id);
	}
	
}

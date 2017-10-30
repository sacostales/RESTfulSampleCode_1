package org.rest.mitchell.vehicle.resources;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rest.mitchell.vehicle.model.Vehicle;
import org.rest.mitchell.vehicle.resources.beans.VehicleFilterBean;
import org.rest.mitchell.vehicle.service.VehicleService;

@Path("/vehicles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class VehicleResource {

	VehicleService vehicleservice = new VehicleService();
	
	@GET
	public List<Vehicle> getVehicles(@BeanParam VehicleFilterBean filterBean){
		
		//Filer: Make in non-empty
		if(filterBean.getMake() != null && filterBean.getModel() == null){
			return vehicleservice.getAllVehiclesByMake(filterBean.getMake());
		}
		
		//Filer: Model in non-empty
		if( filterBean.getModel() != null && filterBean.getMake() == null ){
			return vehicleservice.getAllVehiclesByModel(filterBean.getModel());
		}
		
		//Filer: Make and Model in non-empty
		if( filterBean.getMake() != null && filterBean.getModel() != null  ){
			return vehicleservice.getAllVehiclesByMakeAndModel(filterBean.getMake(),filterBean.getModel());
		}
	
		return vehicleservice.getAllVehicles();
	}
	
	@GET
	@Path("/{vehicleId}")
	public Vehicle getVehicle(@PathParam("vehicleId") int id){
		return vehicleservice.getVehicle(id);
	}
	
	@POST
	public Vehicle addVehicle(Vehicle vehicle){
		return vehicleservice.addVehicle(vehicle);
	}
	
	@PUT
	@Path("/{vehicleId}")
	public Vehicle updateVehicle(@PathParam("vehicleId") int id, Vehicle vehicle){
		vehicle.setId(id);
		return vehicleservice.updateVehicle(vehicle);
	}
	
	@DELETE
	@Path("/{vehicleId}")
	public void deleteVehicle(@PathParam("vehicleId") int id){
		 vehicleservice.removeVehicle(id);
	}
}

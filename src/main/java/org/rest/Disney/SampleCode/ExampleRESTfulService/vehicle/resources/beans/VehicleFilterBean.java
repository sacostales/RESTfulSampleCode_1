package org.rest.Disney.SampleCode.ExampleRESTfulService.vehicle.resources.beans;

import javax.ws.rs.QueryParam;

//This class used for filter purpose
public class VehicleFilterBean {

	private @QueryParam("Year") int year;
	private @QueryParam("Make") String make;
	private @QueryParam("Model") String model;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}

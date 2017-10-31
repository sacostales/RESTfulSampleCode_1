package org.rest.Disney.SampleCode.ExampleRESTfulService.vehicle.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement //Used when to get response in XML
public class Vehicle {
//Model class of resource Vehicle
	
	private int id;
	private int  year;
	private String make;
	private String model;
	
	public Vehicle(int id, int year, String make, String model) {
		
		this.id = id;
		this.year = year;
		this.make = make;
		this.model = model;
	}
	
	public Vehicle(){
		
	}
	
	//Getters and setters for encapsulation 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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

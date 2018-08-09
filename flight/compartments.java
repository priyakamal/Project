package com.flight;

import java.util.List;

public class compartments {
	private String actualAvailability;
	private List<String> amenities;
	private String compartmentCode;
    private String compartmentName;
    private List<String> fareClasses;
    private String mealCode;
    private String specificAvailability;
    
	public String getActualAvailability() {
		return actualAvailability;
	}
	public void setActualAvailability(String actualAvailability) {
		this.actualAvailability = actualAvailability;
	}
	public List<String> getAmenities() {
		return amenities;
	}
	public void setAmenities(List<String> amenities) {
		this.amenities = amenities;
	}
	public String getCompartmentCode() {
		return compartmentCode;
	}
	public void setCompartmentCode(String compartmentCode) {
		this.compartmentCode = compartmentCode;
	}
	public String getCompartmentName() {
		return compartmentName;
	}
	public void setCompartmentName(String compartmentName) {
		this.compartmentName = compartmentName;
	}
	public List<String> getFareClasses() {
		return fareClasses;
	}
	public void setFareClasses(List<String> fareClasses) {
		this.fareClasses = fareClasses;
	}
	public String getMealCode() {
		return mealCode;
	}
	public void setMealCode(String mealCode) {
		this.mealCode = mealCode;
	}
	public String getSpecificAvailability() {
		return specificAvailability;
	}
	public void setSpecificAvailability(String specificAvailability) {
		this.specificAvailability = specificAvailability;
	}
	
}

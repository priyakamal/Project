package com.flight;

import java.util.List;
public class FlightCabinInfo {
	private List<String> cabinCounts;
	private List<String> gateDeparture;
	
	public List<String> getCabinCounts() {
		return cabinCounts;
	}
	public void setCabinCounts(List<String> cabinCounts) {
		this.cabinCounts = cabinCounts;
	}
	public List<String> getGateDeparture() {
		return gateDeparture;
	}
	public void setGateDeparture(List<String> gateDeparture) {
		this.gateDeparture = gateDeparture;
	}
}

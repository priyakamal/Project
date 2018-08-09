package com.flight;

import java.util.List;

public class FlightStatus {
	private String actualFlightLegCount;
    private String actualLegSequenceText;
    private List<String> apiError;
    private String arrivalDate;
    private String departDate;
    private List<String> flightLegDetails;
    private long flightNo;
    private long fpesFlightId;
    private String scheduledArrivalTime;
    private String responseMessage;
    private String scheduledDepartTime;
    private String[] operationalRemarks;

	 
	public String getActualFlightLegCount() {
		return actualFlightLegCount;
	}
	public void setActualFlightLegCount(String actualFlightLegCount) {
		this.actualFlightLegCount = actualFlightLegCount;
	}
	public String getActualLegSequenceText() {
		return actualLegSequenceText;
	}
	public void setActualLegSequenceText(String actualLegSequenceText) {
		this.actualLegSequenceText = actualLegSequenceText;
	}
	public List<String> getApiError() {
		return apiError;
	}
	public void setApiError(List<String> apiError) {
		this.apiError = apiError;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getDepartDate() {
		return departDate;
	}
	public void setDepartDate(String departDate) {
		this.departDate = departDate;
	}
	public List<String> getFlightLegDetails() {
		return flightLegDetails;
	}
	public void setFlightLegDetails(List<String> flightLegDetails) {
		this.flightLegDetails = flightLegDetails;
	}
	public long getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(long flightNo) {
		this.flightNo = flightNo;
	}
	public long getFpesFlightId() {
		return fpesFlightId;
	}
	public void setFpesFlightId(long fpesFlightId) {
		this.fpesFlightId = fpesFlightId;
	}
	public String getScheduledArrivalTime() {
		return scheduledArrivalTime;
	}
	public void setScheduledArrivalTime(String scheduledArrivalTime) {
		this.scheduledArrivalTime = scheduledArrivalTime;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public String getScheduledDepartTime() {
		return scheduledDepartTime;
	}
	public void setScheduledDepartTime(String scheduledDepartTime) {
		this.scheduledDepartTime = scheduledDepartTime;
	}
	public String[] getOperationalRemarks() {
		return operationalRemarks;
	}
	public void setOperationalRemarks(String[] operationalRemarks) {
		this.operationalRemarks = operationalRemarks;
	}
}
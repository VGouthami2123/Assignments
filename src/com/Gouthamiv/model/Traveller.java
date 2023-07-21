package com.Gouthamiv.model;

public class Traveller
{
	private String name;
	private String mobile;
	private String email;
	private String FlightId;
	private String LocalDate;
	public Traveller() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFlightId() {
		return FlightId;
	}
	public void setFlightId(String flightId) {
		FlightId = flightId;
	}
	public String getLocalDate() {
		return LocalDate;
	}
	public void setLocalDate(String localDate) {
		LocalDate = localDate;
	}
	public Traveller(String name, String mobile, String email, String flightId, String localDate) {
	
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		FlightId = flightId;
		LocalDate = localDate;
	}

}

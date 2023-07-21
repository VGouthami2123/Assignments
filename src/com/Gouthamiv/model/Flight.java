package com.Gouthamiv.model;

public class Flight 
{
	private String FlightId;
	private String source;
	private String destination;
	private double fare;
	private int totalseats;
	int availableseats;
	private String arrivaltime;
	private String departuretime;
	private String companyname;
	public Flight() {}
	public Flight(String flightId, String source, String destination, double fare, int totalseats, int availableseats,
			String arrivaltime, String departuretime, String companyname) {
		
		FlightId = flightId;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.totalseats = totalseats;
		this.availableseats = availableseats;
		this.arrivaltime = arrivaltime;
		this.departuretime = departuretime;
		this.companyname = companyname;
	}
	public String getFlightId() {
		return FlightId;
	}
	public void setFlightId(String flightId) {
		FlightId = flightId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public int getTotalseats() {
		return totalseats;
	}
	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}
	public int getAvailableseats() {
		return availableseats;
	}
	public void setAvailableseats(int availableseats) {
		this.availableseats = availableseats;
	}
	public String getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public String getDeparturetime() {
		return departuretime;
	}
	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	

}

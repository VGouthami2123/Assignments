package com.lvg.model;
public class Adderss 
{
	String hno;
	String street;
	String city;
	String state;
	public Adderss() {}
	
	public Adderss(String hno, String street, String city, String string) {
		super();
		this.hno = hno;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	

	public Adderss(String hno, String street, String city) {
		// TODO Auto-generated constructor stub
	}

	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}

package com.lvg.model;

public class Company 
{
	private String companyName;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public Department[] getDepartment() {
		return department;
	}
	public void setDepartment(Department[] department) {
		this.department = department;
	}
	private String Location;
	private Department[] department;
	public Company() {}
	public Company(String companyName, String location, Department[] department) {
		
		this.companyName = companyName;
		this.Location = location;
		this.department = department;
	}
	
	

}

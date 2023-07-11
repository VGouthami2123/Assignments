package com.lvg.model;

public class Employ
{
	int EmployId;
	String EmployName;
	double salary;
	Adderss Adderss;
	public Employ() {}
	
	public Employ(int employId, String EmployName, double salary, Adderss Adderss) {
	
		this.EmployId = EmployId;
		this.EmployName = EmployName;
		this.salary = salary;
		this.Adderss = Adderss;
	}

	public int getEmployId() {
		return EmployId;
	}
	public void setEmployId(int EmployId) {
		this.EmployId = EmployId;
	}
	public String getEmployName() {
		return EmployName;
	}
	public void setEmployName(String EmployName) {
		this.EmployName = EmployName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Adderss getAddress() {
		return Adderss;
	}
	public void setAddress(Adderss Address) {
		this.Adderss = Adderss;
	}
	
		
	

}

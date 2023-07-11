package com.lvg.model;
import com.lvg.model.Adderss;
import com.lvg.model.Employ;
import com.lvg.model.Department;
public class Main
{
	public static void main(String[] args)
	{
		Employ[] elist = new Employ[3];
		elist[0] = new Employ(102,"Babu",2000,new Adderss("1-32","Mg Street","Banglore","karnakata"));
		elist[1] = new Employ(103,"Banu",6000,new Adderss("1-82","Ma Street","Banglore","karnakata"));
		elist[2] = new Employ(104,"Balu",5000,new Adderss("1-352","Ml Street","Banglore","karnakata"));
		
		Department d = new Department(10,"sales","Mumbai",elist);
		
		System.out.println("-------Department Details-----");
		System.out.println("Deaprtment Number: "+d.getDepartmentNo());
		System.out.println("Deaprtment Name: "+d.getName());
		System.out.println("Department Location: "+d.getLocation());
		for(Employ e : elist)
		{
		System.out.println("Employ Id: "+e.getEmployId());
		System.out.println("Employ name: "+e.getEmployName());
		System.out.println("salary: "+e.getSalary());
		System.out.println("-------Adderss-----");
		System.out.println("Hno: "+ e.getAddress().getHno());
		System.out.println("Street: "+ e.getAddress().getStreet());
		System.out.println("salary: "+ e.getAddress().getCity());
		System.out.println("salary: "+ e.getAddress().getState());
		System.out.println();
	   }
	}
}
	



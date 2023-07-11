package com.lvg.model;
import com.lvg.model.Adderss;
import com.lvg.model.Employ;
import com.lvg.model.Department;
public class Main2
{
	public static void main(String[] args)
	{
		Employ[] elist1 = new Employ[3];
		elist1[0] = new Employ(102,"Babu",2000,new Adderss("1-32","Mg Street","Banglore","karnakata"));
		elist1[1] = new Employ(103,"Banu",6000,new Adderss("1-82","Ma Street","Banglore","karnakata"));
		elist1[2] = new Employ(104,"Balu",5000,new Adderss("1-352","Ml Street","Banglore","karnakata"));
		
		Employ[] elist2 = {new Employ(104,"Dinesh",4000,new Adderss("4-5","temple street","xyz","telangana")),

                          new Employ(105,"Dinesh",5000,new Adderss("4-6","sr  street","abc","kerala")),

                          new Employ(106,"Dinesh",6000,new Adderss("4-8","br street","pqr","orisha"))};



        Company c = new Company("abc Corpotarion","nweyork",new Department[] {
    		  new Department(10,"sales","Hyderabad",elist1),
    		  new Department(20,"marketing","banglore",elist2)
        });
      System.out.println("Company Name        :" + c.getCompanyName());
      System.out.println("Company Location        :" + c.getLocation());
      System.out.println("---------Department-------------");
      for(Department d : c.getDepartment())
      {
    	  System.out.println(d.getDepartmentNo()+"   "+d.getName()+"     "+d.getLocation());
    	  for(Employ e : d.getEmployees())
    	  {
    		    System.out.println("\t "+e.getEmployId());
    			System.out.println("\t "+e.getEmployName());
    			System.out.println("\t "+e.getSalary());
    			System.out.println("\t "+ e.getAddress().getHno());
    			System.out.println("\t "+ e.getAddress().getStreet());
    			System.out.println("\t "+ e.getAddress().getCity());
    			System.out.println("\t "+ e.getAddress().getState());
    			System.out.println();
    	  }
    	  System.out.println();
      }
	}
}
      
      
		
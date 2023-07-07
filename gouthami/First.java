class First
{
	public static void main(String[] args)
	{
		Employee e = new Employee(7001,"Ajay",34,5678,67000,"Abc");
		System.out.println("Ssn       " + e.getSsn());
		System.out.println("Name      " + e.getName());
		System.out.println("Age       " + e.getAge());
		System.out.println("Empid     " + e.getEmpid());
		System.out.println("Salary    " + e.getSalary());
		System.out.println("OrgName   " + e.getOrgName());
		
	}
}


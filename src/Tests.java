
public class Tests
{
	public static void main(String[] args)
	{
		Bank1 bank = new Bank1();
		SavingsAccount1 s1 = new SavingsAccount1(1,"2023-05-13",12000.0,800.0,4);
		SavingsAccount1 s2 = new SavingsAccount1(2,"2023-06-11",10000.0,900.0,1);
		SavingsAccount1 s3 = new SavingsAccount1(3,"2023-03-16",11000.0,700.0,2);
		SavingsAccount1 s4 = new SavingsAccount1(5,"2023-02-17",13000.0,200.0,3);
		//SavingsAccount1 s5 = new SavingsAccount1(4,"2023-07-14",14000.0,600.0,4);
		//SavingsAccount1 s6 = new SavingsAccount1(6,"2023-04-12",15000.0,400.0,5);
		 bank.addAccount1(s1);
		 bank.addAccount1(s2);
		 bank.addAccount1(s3);
		 bank.addAccount1(s4);
		// bank.addAccount1(s5);
		// bank.addAccount1(s6);
		CurrentAccount1 c1 = new CurrentAccount1(7,"2023-05-13",12000.0,800);
		CurrentAccount1 c2 = new CurrentAccount1(8,"2023-05-13",13000.0,900);
		CurrentAccount1 c3 = new CurrentAccount1(9,"2023-05-13",14000.0,600);
		CurrentAccount1 c4 = new CurrentAccount1(10,"2023-05-13",15000.0,400);
		CurrentAccount1 c5 = new CurrentAccount1(11,"2023-05-13",16000.0,300);
		
		bank.addAccount1(c1);
		bank.addAccount1(c2);
		bank.addAccount1(c3);
		bank.addAccount1(c4);
		bank.addAccount1(c5);
		bank.transcation('d',13000.0);
		bank.transcation('d',13000.0);
		bank.transcation('w',8500.0);
		bank.showAccounts();
		
		
		
		
		
	}

}

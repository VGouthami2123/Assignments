import java.time.LocalDate;
class Account
{
	private int accountNumber;
	private double balance;
	private String accountHolderName;
	private LocalDate openedDate;
	public Account() {}

	public Account(int accountNumber,double balance,String accountHolderName,LocalDate openedDate)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
		this.openedDate = openedDate;
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Account)
		{
			Account a1 = (Account)obj;
			return accountNumber == a1.accountNumber && balance == a1.balance && accountHolderName.equals(a1.accountHolderName) && openedDate.equals(a1.openedDate);
			
		}
		return false;
	}
	public String toString()
	{
		return "Account Number: " + accountNumber + "\nBalance: " + balance+"\nAccountHolderName: " + accountHolderName+"\nOpenedDate: " + openedDate;
		
	}

}

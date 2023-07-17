
public class Account1
{	
	private int accountNo;
	private String openedDate;
	private double balance;
	public Account1() {}
	public Account1(int accountNo, String openedDate, double balance)
	{
		this.accountNo = accountNo;
		this.openedDate = openedDate;
		this.balance = balance;
	}
	public int getAccountNo() 
	{
		return accountNo;
	}
	public void setAccountNo(int accountNo) 
	{
		this.accountNo = accountNo;
	}
	public String getOpenedDate() {
		return openedDate;
	}
	public void setOpenedDate(String openedDate) 
	{
		this.openedDate = openedDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}


}
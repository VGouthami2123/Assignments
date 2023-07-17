
public class Bank1
{
	private String bankName;
	private String branchName;
	Account1[] accounts1;
	private int index=0;
	public Bank1() {}
	public Bank1(String bankName, String branchName) {
		this.bankName = bankName;
		this.branchName = branchName;
		this.accounts1=new Account1[10];
		this.index=0;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public boolean addAccount1(Account1 account1)
	{	
		if(index >= 10)
		{
		/*{
			throw new RuntimeException("cant add more than 10 files");
		}
		if(account1 instanceof SavingsAccount1 | account1 instanceof CurrentAccount1)
		{*/
			accounts1[index] = account1;
			index++;
		}
		else
			throw new RuntimeException("can't add more files");
		return false;
		
		   // return true;
		//}
		//return false;
	}
	
	
		
	public boolean transaction(char ttype, int accountNo, double amount)
	{
    	for(int i=0;i<index;i++)
    	{
    		if (accounts1[i].getAccountNo() == accountNo)
    		{
    			if(ttype == 'w')
    				{
    						if(accounts1[i] instanceof SavingsAccount1)
    						{
    							if(accounts1[i].getBalance() - amount >= SavingsAccount1.mimimumDepositAmount)
    								accounts1[i].setBalance(accounts1[i].getBalance() - amount);
    							else
    								throw new RuntimeException("Can't add more than 10 files");
    								
    						}
    						else {}
    				}
    			else if(ttype == 'D')
    			{
    				accounts1[i].setBalance(accounts1[i].getBalance() + amount);
    			}
    			else
    				throw new RuntimeException("Can't add more than 10 files");
    		}
    	}
    	return false;
	}
	
	public void showAccounts() {
		for(int i=0;i<index;i++)
		{
			System.out.println("Bank name:" + "ICICI");
			System.out.println("Branch Name:" + "Guntur");
			System.out.println("Acounts1");
			
		}
		
	}
	public void transcation(char c, double d) {
		// TODO Auto-generated method stub
		
	}
}
      

	
		
	        
	        	
	        
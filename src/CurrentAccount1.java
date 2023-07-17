public class CurrentAccount1 extends Account1
{
	private int overDraftLimit;
	public CurrentAccount1() {}
	public CurrentAccount1(int accountNo, String openedDate, double balance,int overDraftLimit) {
		super(accountNo,openedDate,balance);
		this.overDraftLimit = overDraftLimit;
	}
	public int getOverDraftLimit()
	{
		return overDraftLimit;
	}
	public void setOverDraftLimit(int overDraftLimit) 
	{
		this.overDraftLimit = overDraftLimit;
	}
	public boolean validateOverDraft(double amount)
	{
        return (getBalance() - amount) >= overDraftLimit;
    }

}
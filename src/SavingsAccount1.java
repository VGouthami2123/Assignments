public class SavingsAccount1 extends Account1
{
	public static final  double  mimimumDepositAmount = 1000;
	public static final   int noOfTranscationsPerDay = 5;
	public SavingsAccount1() {}
	public SavingsAccount1(int accountNo,String opendDate,double balance,double mimimumDepositAmount, int noOfTranscationsPerDay) {
		super();
		
	}
	public double getMimimumDepositAmount() {
		return mimimumDepositAmount;
	}
	
	public boolean validateDepositAmount(double amount)
	{
		return(getBalance()-amount >= mimimumDepositAmount);
	}
	public boolean validatenoOfTranscations(int count)
	{
		return count <= noOfTranscationsPerDay;
	}
}
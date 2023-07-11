class Account1
{
	private int AccountNumber;
	private double BalanceAmount;
	private String OpeningDate;
	public Account1() {}
	public Account1(int accountNumber, double balanceAmount, String openingDate) {
		AccountNumber = accountNumber;
		BalanceAmount = balanceAmount;
		OpeningDate = openingDate;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public double getBalanceAmount() {
		return BalanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		BalanceAmount = balanceAmount;
	}
	public String getOpeningDate() {
		return OpeningDate;
	}
	public void setOpeningDate(String openingDate) {
		OpeningDate = openingDate;
	}
	
	
}
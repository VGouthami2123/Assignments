
public class InsufficientBalanceException1 extends RuntimeException
{
	String message;
	public InsufficientBalanceException1() {}
	public InsufficientBalanceException1(String message)
	{
		this.message = message;
	}
	public String getMessage()
	{
		return message;
	}
	public String toString()
	{
		return " InsufficientBalanceException :" + message;
	}
}

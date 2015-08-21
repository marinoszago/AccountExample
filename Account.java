public class Account 
{
	
	public final double DEFAULT_BALANCE = 0.0;
	
	private int accountNumber;
	private double balance;

	public Account(int accountNumber, double balance) 
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	public Account(int accountNumber) 
	{
		this.accountNumber = accountNumber;
		balance = DEFAULT_BALANCE;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public void credit(double amount)
	{
		balance += amount;
	}
	public void debit(double amount)
	{
		if(amount > balance)
		{
			System.out.println("Amount withdrawn exceeds the current balance");
		}
		else
			balance = balance - amount;
	}
	
	public String toString()
	{
		 return String.format("A/C no: %d Balance=%.2f", accountNumber, balance);
	}

}


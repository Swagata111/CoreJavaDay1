package com.capgemini.bank;

/**  
 * @author swkundu
 * @since 03-10-2018
 * 
 */
public abstract class BankAccount implements Comparable<BankAccount>
{
	int accountNo;
	String accountHolderName;
	double accountBalance;
	static int autoAccountNoGen;
	{
		accountNo=++autoAccountNoGen;
	}
	public BankAccount() 
	{	
			accountHolderName="Unknown";
			accountBalance=0;
	}
	public BankAccount(String accountHolderName, double accountBalance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	
	public abstract void withdraw(double amount);
	
	
	public abstract void deposit(double amount);
	
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}
	public int getAccountNo() {
		return accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance() 
	{
		return accountBalance;
	}
	@Override
	public int compareTo(BankAccount acc) 
	{
		return getAccountNo()+acc.getAccountNo();
	
	}
	    

	
}

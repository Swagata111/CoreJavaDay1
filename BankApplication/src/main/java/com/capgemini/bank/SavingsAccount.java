package com.capgemini.bank;

public class SavingsAccount extends BankAccount 
{
public void withdraw(double amount)
{
	if(amount<accountBalance)
		accountBalance-=amount;
	else
		System.out.println("Insufficient account balance");
}

public void deposit(double amount)
{
	accountBalance+=amount;
}

@Override
public String toString() {
	return "SavingsAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
			+ accountBalance + "]";
}


}

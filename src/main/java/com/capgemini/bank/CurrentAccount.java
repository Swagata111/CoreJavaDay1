package com.capgemini.bank;

public class CurrentAccount extends BankAccount 
{
 public double odlimit=10000;
 public void withdraw(double amount)
 {
 	if(amount<accountBalance && amount<odlimit)
 		accountBalance-=amount;
 	else
 		System.out.println("You can't withdraw this ammount");
 }

 public void deposit(double amount)
 {
 	accountBalance+=amount;
 }

public double getOdlimit() {
	return odlimit;
}


 
}

package com.capgemini.cust;

import com.capgemini.bank.BankAccount;
import com.capgemini.bank.CurrentAccount;
import com.capgemini.bank.SavingsAccount;
import com.capgemini.bank.SavingsAccount2;

public class Customer {

	public static void main(String[] args) 
	{
		BankAccount acc1=new SavingsAccount();
		SavingsAccount acc2=new SavingsAccount();
		//BankAccount acc3=acc1;
		CurrentAccount acc4=new CurrentAccount();
		 
		SavingsAccount2 s1=new SavingsAccount2();
		
		System.out.println(s1.getPolicyName());
		
		
		System.out.println(acc4.getOdlimit());
		BankAccount acc5=new CurrentAccount();
		//this can't be done
		//System.out.println(acc5.getOdlimit());
		acc1.deposit(10000);
		acc1.withdraw(5000);
	
		acc1.setAccountHolderName("Swagata");
		acc2.setAccountHolderName("Sangita");
		acc4.setAccountHolderName("Ashwini");
		acc4.deposit(4000);
		acc4.withdraw(7000);
		acc2.deposit(6000);
		acc2.withdraw(8000);
		//System.out.println(acc2);
		System.out.println("Account Balance of "+acc1.getAccountHolderName()+": "+acc1.getAccountBalance());
		System.out.println(acc1);	
		System.out.println(acc2);
		System.out.println(acc4);

	}

}

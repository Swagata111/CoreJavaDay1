package com.capgemini.bank;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
public class BankAccountLinkedList 
{
LinkedList<BankAccount> banklist=new LinkedList<BankAccount>();

public void add(SavingsAccount ob)
{
	banklist.add(ob);
}

public void remove(int id)
{
	for (BankAccount b:banklist)
	{
		if(b.getAccountNo()==id)
			banklist.remove(b);
	}
	
}
public LinkedList<BankAccount> getAllBankAccount()
{
	return banklist;
}

public BankAccount getAccountById(int id)
{
	for (BankAccount b:banklist)
	{
		if(b.getAccountNo()==id)
			return b;
	}
	return null;
	
}

public void updateById(int id,String name)
{
	for (BankAccount b:banklist)
	{
		if(b.getAccountNo()==id)
			b.setAccountHolderName(name);
	}
}

public void sortAccountByName()
{
	banklist.sort((BankAccount acc1,BankAccount acc2)->acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName()));
}

public LinkedList<BankAccount> sortAccountByNamev2()
{
	Collections.sort(banklist, new Comparator<BankAccount>() {
	
	@Override
	public int compare(BankAccount acc1,BankAccount acc2)
	{
		return acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName());
	}
	});

return banklist;
}


	public static void main(String[] args) 
	{
		SavingsAccount ob=new SavingsAccount();
		SavingsAccount ob1=new SavingsAccount();
		SavingsAccount ob3=new SavingsAccount();
		ob.setAccountHolderName("Swagata");
		ob.deposit(10000);
		ob1.setAccountHolderName("Sangita");
		ob1.deposit(50000);
		ob3.setAccountHolderName("Ashwini");
		ob3.deposit(10000);
		BankAccountLinkedList blist=new BankAccountLinkedList();
		blist.add(ob);
		blist.add(ob3);
		blist.add(ob1);
		System.out.println(blist.getAllBankAccount().toString());
		
		
		System.out.println("Find By Id:");
		System.out.println(blist.getAccountById(3).toString());
		blist.remove(2);
		System.out.println("After removing:");
		System.out.println(blist.getAllBankAccount().toString());	
		System.out.println("After updating");
		blist.updateById(2,"Abhrak");
		System.out.println(blist.getAllBankAccount().toString());
		//blist.sortAccountByName();
		System.out.println("After sorting");
		System.out.println(blist.sortAccountByNamev2().toString());
		
	}

}

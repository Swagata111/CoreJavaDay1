package com.capgemini.bank;


import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
public class BankAccountTreeSet 
{
TreeSet<BankAccount> bankset=new TreeSet<BankAccount>();

public void addAccount(BankAccount ob)
{
	bankset.add(ob);
}

public void remove(int id)
{
	for (BankAccount b:bankset)
	{
		if(b.getAccountNo()==id)
			bankset.remove(b);
	}
	
}
public TreeSet<BankAccount> getAllBankAccount()
{
	return bankset;
}

public BankAccount getAccountById(int id)
{
	for (BankAccount b:bankset)
	{
		if(b.getAccountNo()==id)
			return b;
	}
	return null;
	
}

public void updateById(int id,String name)
{
	for (BankAccount b:bankset)
	{
		if(b.getAccountNo()==id)
			b.setAccountHolderName(name);
	}
	
}

/*public void sortAccountByName()
{
	bankset.sort((BankAccount acc1,BankAccount acc2)->acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName()));
}

public TreeSet<BankAccount> sortAccountByNamev2()
{
	Collections.sort(bankset, new Comparator<BankAccount>() {
	
	@Override
	public int compare(BankAccount acc1,BankAccount acc2)
	{
		return acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName());
	}
	});

return bankset;
}*/


	public static void main(String[] args) 
	{
		BankAccount ob=new SavingsAccount();
		BankAccount ob1=new SavingsAccount();
		BankAccount ob3=new SavingsAccount();
		ob.setAccountHolderName("Swagata");
		ob.deposit(10000);
		ob1.setAccountHolderName("Sangita");
		ob1.deposit(50000);
		ob3.setAccountHolderName("Ashwini");
		ob3.deposit(10000);
		BankAccountTreeSet bset=new BankAccountTreeSet();
		bset.addAccount(ob);
		bset.addAccount(ob1);
		bset.addAccount(ob3);
		
		System.out.println(bset.getAllBankAccount().toString());
		System.out.println("Find By Id:");
		System.out.println(bset.getAccountById(3).toString());
		bset.remove(2);
		System.out.println("After removing:");
		System.out.println(bset.getAllBankAccount().toString());	
		System.out.println("After updating");
		bset.updateById(3,"Abhrak");
		System.out.println(bset.getAllBankAccount().toString());
		
		//bset.sortAccountByName();
		//System.out.println("After sorting");
		//System.out.println(bset.sortAccountByNamev2().toString());
		
	}

}

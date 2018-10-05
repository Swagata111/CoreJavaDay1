package com.capgemini.bank;
public class BankAccountList 
{
	static int index=0;
	BankAccount[] banklist=new BankAccount[10];
	public void add(SavingsAccount ob)
	{	
		banklist[index++]=ob;		
	}
	
	public BankAccount[]  remove(int id)
	{
		for(int j=0;j<index;j++)
		{
			if((banklist[j].getAccountNo())==id)
			{
		     for(int k=j;k<banklist.length-1;k++)
		    	 banklist[k]=banklist[k+1];
		     index--;    
			}
			
		}
		return banklist;
	}
	
	public BankAccount[] update(int id,String name)
	{
		for(int j=0;j<index;j++)
		{
			if((banklist[j].getAccountNo())==id)
			{
					banklist[j].setAccountHolderName(name);

			}		
		}
		return banklist;	
	}
	
	public void getAllAccounts()
	{
		for (BankAccount b:banklist)
			
		System.out.println(b);
	}
	
	public BankAccount[] getAccountById(int id)
	{
		for(int i=0;i<index;i++)
		{
			if((banklist[i].getAccountNo())==id)
				
			{
				return banklist;
			}
		}
		return null;
	}
	
	public static void main(String args[])
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
	BankAccountList blist=new BankAccountList();
	blist.add(ob);
	blist.add(ob1);
	blist.add(ob3);	
	System.out.println("Get By Id");
	blist.getAccountById(2);
	blist.remove(2);
	System.out.println("After removing");
	blist.getAllAccounts();
	
	blist.update(3,"Abhrak");
	System.out.println("After updating");
	blist.getAllAccounts();
	
	}
}

package com.capgemini.bank;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BankAccountMap
{
	Map<Integer,BankAccount> bankaccountMap;
	public BankAccountMap() {
		this.bankaccountMap=new HashMap<>();
	}
	 public void addAccount(int accNo,BankAccount acc)
	 {
		 bankaccountMap.put(accNo, acc);
	 }
	 
	 public Set<Integer> getAllKeys()
	 {
		 return bankaccountMap.keySet();
	 }
	 public Collection<BankAccount> getAllBankAccounts()
	 {
		 return bankaccountMap.values();
	 }
	 public Set<Map.Entry<Integer, BankAccount>> getAllEmployeeBankDetails()
	 {
		 return  bankaccountMap.entrySet();
	 }
}

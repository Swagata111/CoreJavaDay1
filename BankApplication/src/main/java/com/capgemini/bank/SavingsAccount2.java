package com.capgemini.bank;

public class SavingsAccount2 extends SavingsAccount implements InsurancePolicy
{
	public String getPolicyName() 
	{
		// TODO Auto-generated method stub
		return "L.I.C";
	}

	public double getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 100000;
	}

	public int getTime() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public String toString() {
		return "SavingsAccount2 [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}
	
}

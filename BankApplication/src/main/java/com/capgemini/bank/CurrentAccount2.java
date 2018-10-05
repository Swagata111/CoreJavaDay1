package com.capgemini.bank;

public class CurrentAccount2 extends CurrentAccount implements InsurancePolicy
{
	public String getPolicyName() {
		
		return "Jivan Beema";
	}

	public double getInsuranceAmount() {
		
		return 200000;
	}

	public int getTime() {
		
		return 12;
	}
	
}

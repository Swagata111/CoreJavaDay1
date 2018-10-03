package com.capgemini.bank;

public class CurrentAccount2 extends CurrentAccount implements InsurancePolicy
{
	public String getPolicyName() {
		// TODO Auto-generated method stub
		return "Jivan Beema";
	}

	public double getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 200000;
	}

	public int getTime() {
		// TODO Auto-generated method stub
		return 12;
	}
}

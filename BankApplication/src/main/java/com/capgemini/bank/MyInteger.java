package com.capgemini.bank;

public class MyInteger 
{
	int myInt;

	public int getMyInt() {
		return myInt;
	}

	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}

	public MyInteger(int myInt) {
		super();
		this.myInt = myInt;
	}

	public MyInteger() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "[myInt=" + myInt + "]";
	}

	public int compareTo(MyInteger key) {
		
		return getMyInt()-key.getMyInt();
	}
	
}

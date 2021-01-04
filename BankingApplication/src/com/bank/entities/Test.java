package com.bank.entities;

public class Test {

	public static void main(String[] args) {
		
		CustomerDetails C2 = new CustomerDetails("Bill","Gates","01 Jan 1975");
		CustomerDetails C3 = new CustomerDetails("Jeff", "Bezos", "2 Jan 1980");
		CustomerDetails C4 = new CustomerDetails("Jack", "Ma", "3 Jan 1982");
		
		CustomerDetails.Print();
		CustomerDetails.Deposit(1000, 2000l);
		CustomerDetails.Print();
		
	}

}

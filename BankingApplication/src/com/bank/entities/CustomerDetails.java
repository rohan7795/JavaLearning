package com.bank.entities;

public class CustomerDetails {

	String name;
	String LastName;
	String DOB;
	static int ID = 1000;
	int CustomerID;
	Long AccountBalance = 10000l;
	static CustomerDetails[] Array = new CustomerDetails[10];
	static int i = 0;

	CustomerDetails(String name, String LastName, String DOB) {

		this.name = name;
		this.LastName = LastName;
		this.DOB = DOB;
		this.CustomerID = ID;
		this.AccountBalance = AccountBalance;
		ID++;
		Array[i] = this;
		i++;

	}

	static void Details(CustomerDetails a) {

		System.out.println("Name:" + a.name + " " + a.LastName + "DOB: " + a.DOB + "CustomerID: " + a.CustomerID
				+ a.AccountBalance);
	}

	static void Withdrawal(int custId, Long amt) {
		CustomerDetails cust = identifyCustomer(custId);

		cust.AccountBalance = cust.AccountBalance - amt;

	}

	static CustomerDetails identifyCustomer(int id) {

		for (int k = 0; k < Array.length; k++) {
			if (id == Array[k].CustomerID) {
				return Array[k];
			}
		}
		return null;
	}

	static void Deposit(int UID, Long depo) {

		for (int n=0; n<3; n++) {
			if (UID == Array[n].CustomerID)
				Array[n].AccountBalance = Array[n].AccountBalance + depo; 
				
		}
	}

	static void Print() {
		try {
			for (int i = 0; i < Array.length; i++) {

				System.out.println(Array[i].name + Array[i].AccountBalance);
			}
		} catch (NullPointerException e) {

		}

	}
}

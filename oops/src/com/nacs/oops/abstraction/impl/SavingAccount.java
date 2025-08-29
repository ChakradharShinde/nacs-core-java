package com.nacs.oops.abstraction.impl;

import com.nacs.oops.abstraction.BankAccount;

public class SavingAccount extends BankAccount {
	
	
	public SavingAccount() {
		super(15000);
	}
	
	public SavingAccount(float balance) {
			super(balance);
		
	}
	
	@Override
	public void debit(float amount) {
		if(checkBalance()-amount>0) {
			setBalance(getBalance()-amount);
			System.out.println("Amount Debited : " + amount);
		}else {
			System.out.println("Insufficient Balace");
		}
	}
	
	@Override
	public void credit(float amount) {
		setBalance(getBalance()+amount);
	}
}

package com.nacs.oops.abstraction.main;

import com.nacs.oops.abstraction.BankAccount;
import com.nacs.oops.abstraction.impl.SavingAccount;

public class MainBankAccount {
	public static void main(String[] args) {
		BankAccount account1 = new SavingAccount(50000);
		System.out.println("Balance = " + account1.getBalance());
		account1.debit(51000);
		System.out.println("Balance = " + account1.getBalance());
		account1.credit(10000);
		System.out.println("Balance = " + account1.getBalance());
	}
}

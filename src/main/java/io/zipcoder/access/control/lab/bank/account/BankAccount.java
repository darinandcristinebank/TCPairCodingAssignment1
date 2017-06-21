package io.zipcoder.access.control.lab.bank.account;

import java.util.ArrayList;
import java.util.Arrays;

public class BankAccount {
	
	//Fields
	
	private enum AcctType {CHECKING, SAVINGS, INVESTMENT};
	private String acctNum;
	private double balance;
	private String acctHolder;
	private double interestRate;
	public enum STATUS {OPEN, CLOSED, OFAC_FREEZE};
	private enum OD_Prevention {ENABLED, DISABLED, AUTO_ACCT_TRANSFER};
	private ArrayList<String> history = new ArrayList<> (Arrays.asList(transactions));
	
	//Methods
	
	public boolean setStatus(STATUS acctStatus){
		//set status to open
		return true;
	}
	
	
	
	
	
	
}

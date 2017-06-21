package io.zipcoder.access.control.lab.bank.account;

import java.util.ArrayList;
import java.util.Arrays;

public class BankAccount {
	
	//Fields
	
	private enum ACCTTYPE {CHECKING, SAVINGS, INVESTMENT};
	private ACCTTYPE acctType;
	private String acctNum;
	private double balance;
	private String acctHolder;
	private double interestRate;
	public enum STATUS {OPEN, CLOSED, OFAC_FREEZE};
	private STATUS acctStatus; 
	private enum OD_Prevention {ENABLED, DISABLED, AUTO_ACCT_TRANSFER};
	private ArrayList<String> history = new ArrayList<> (Arrays.asList(transactions));
	
	//Methods
	
	// Set Status
	public void setStatus(STATUS acctStatus){
		//set status to open
		this.acctStatus = acctStatus;
	}
	
	// Get Status
	public STATUS getStatus(){
		//get account status
		return acctStatus;
	}
	
	
	// Set AcctType
	public void setStatus(ACCTTYPE acctType){
		//set status to open
		this.acctType = acctType;
	}
	
	// Get AcctType
	public ACCTTYPE getAcctType(){
		//get account type
		return acctType;
	}
	
	
	
}

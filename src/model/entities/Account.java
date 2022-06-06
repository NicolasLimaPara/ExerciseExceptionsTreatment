package model.entities;

import model.exceptions.Exceptions;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account () {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdarawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdarawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	
	public void deposit (Double amount) {
		balance += amount;
	}
	
	public void withdraw (Double amount) throws Exceptions{
		if (balance>=amount && amount<= withdrawLimit)
			balance -= amount;
		
		else if (balance < amount) {
			throw new Exceptions("Withdraw Operation is not available. Insuficient balance!");
		}
		else if (amount > withdrawLimit) {
			throw new Exceptions("Withdraw limit is not available.");
		}
	}
	
	
	
	
	

}

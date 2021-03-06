package com.techelevator.tenmo.models;

import java.math.BigDecimal;

public class Transfers {
	
	private Long transferId;
	private int transferTypeId;
	private int transferStatusId;
	private int accountFrom;
	private int accountTo;
	private BigDecimal amount;
	
	public Transfers(Long transferId, int transferTypeId, int transferStatusId, 
						int accountFrom, int accountTo, BigDecimal amount) {
		this.transferId = transferId;
		this.transferTypeId = transferTypeId;
		this.transferStatusId = transferStatusId;
		this.accountFrom = accountFrom;
		this.accountTo = accountTo;
		this.amount = amount;
	}
	
	public Transfers() {
	//Overloaded
	}

	public Long getTransferId() {
		return transferId;
	}

	public void setTransferId(Long transferId) {
		this.transferId = transferId;
	}

	public int getTransferTypeId() {
		return transferTypeId;
	}

	public void setTransferTypeId(int transferTypeId) {
		this.transferTypeId = transferTypeId;
	}

	public int getTransferStatusId() {
		return transferStatusId;
	}

	public void setTransferStatusId(int transferStatusId) {
		this.transferStatusId = transferStatusId;
	}

	public int getAccountFrom() {
		return accountFrom;
	}

	public void setAccountFrom(int accountFrom) {
		this.accountFrom = accountFrom;
	}

	public int getAccountTo() {
		return accountTo;
	}

	public void setAccountTo(int accountTo) {
		this.accountTo = accountTo;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		
		return "Transfer ID: " + this.transferId + " | Transfer Type: " + this.transferTypeId + " | Transfer Status: " +
		this.transferStatusId + " | Account ID From: " + this.accountFrom + " | Account ID To: " +
				this.accountTo + " | Amount: " + this.amount;
	}
	

}

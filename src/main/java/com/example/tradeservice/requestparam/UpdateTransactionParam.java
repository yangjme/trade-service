package com.example.tradeservice.requestparam;

import lombok.Data;

//@Data
public class UpdateTransactionParam {
	private Integer TransactionId;
	private Integer TradeId;
	private String securityCode;
	private Integer quantity;
	private String buyOrSell;
	
	public UpdateTransactionParam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getTransactionId() {
		return TransactionId;
	}

	public void setTransactionId(Integer transactionId) {
		TransactionId = transactionId;
	}

	public Integer getTradeId() {
		return TradeId;
	}

	public void setTradeId(Integer tradeId) {
		TradeId = tradeId;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getBuyOrSell() {
		return buyOrSell;
	}

	public void setBuyOrSell(String buyOrSell) {
		this.buyOrSell = buyOrSell;
	}
	
	
}

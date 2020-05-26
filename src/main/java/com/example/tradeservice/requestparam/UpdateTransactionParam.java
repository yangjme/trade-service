package com.example.tradeservice.requestparam;

import lombok.Data;

@Data
public class UpdateTransactionParam {
	private Integer TransactionId;
	private Integer TradeId;
	private String securityCode;
	private Integer quantity;
	private String buyOrSell;
	
}

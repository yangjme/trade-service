package com.example.tradeservice.requestparam;

import lombok.Value;

@Value
public class CreateTransactionParam {
	private Integer TransactionId;
	private Integer TradeId;
	private String securityCode;
	private Integer quantity;
	private String buyOrSell;
}

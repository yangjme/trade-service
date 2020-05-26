package com.example.tradeservice.service;

import java.util.List;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tradeservice.entity.Transaction;
import com.example.tradeservice.enums.SecurityCode;
import com.example.tradeservice.enums.TradeActionType;
import com.example.tradeservice.enums.TradeType;
import com.example.tradeservice.repository.TransactionRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	public void insertTransaction(Integer tradeId, String securityCode,
			Integer quantity, String buyOrSell) {
		Objects.requireNonNull(tradeId);
		Transaction newTrans = new Transaction();
		newTrans.setTradeId(tradeId);
		newTrans.setQuantity(quantity);
		if (StringUtils.isNotEmpty(securityCode)) {
			newTrans.setSecurityCode(SecurityCode.valueOf(securityCode));
		}
		if (StringUtils.isNotEmpty(buyOrSell)) {
			newTrans.setTradeType(TradeType.valueOf(buyOrSell));
		}
		
		newTrans.setTradeActionType(TradeActionType.UPDATE);

		transactionRepository.save(newTrans);
	}
	
	public void updateTransaction(Integer transactionId, Integer tradeId, String securityCode,
			Integer quantity, String buyOrSell) {
		Objects.requireNonNull(transactionId);
		Objects.requireNonNull(tradeId);
		
		Transaction transaction = transactionRepository.findByTransactionIdAndTradeId(transactionId, tradeId);
		
		if (transaction == null) {
			throw new RuntimeException("The Transacition is not found");
		}
		
		if (StringUtils.isNotEmpty(securityCode)) {
			transaction.setSecurityCode(SecurityCode.valueOf(securityCode));
		}
		if (quantity != null) {
			transaction.setQuantity(quantity);
		}
		
	    if (StringUtils.isNotEmpty(buyOrSell)) {
	    	transaction.setTradeType(TradeType.valueOf(buyOrSell));
	    }
	    
	    transaction.setTradeActionType(TradeActionType.UPDATE);

	    transactionRepository.save(transaction);
	}
	
	public void cancelTransaction(Integer transactionId, Integer tradeId, String securityCode,
			Integer quantity, String buyOrSell) {
		Objects.requireNonNull(transactionId);
		Objects.requireNonNull(tradeId);
		
		Transaction transaction =  transactionRepository.findByTransactionIdAndTradeId(transactionId, tradeId);
		
		if (transaction == null) {
			throw new RuntimeException("The Transaction is not found");
		}
		
		if (StringUtils.isNotEmpty(securityCode)) {
			transaction.setSecurityCode(SecurityCode.valueOf(securityCode));
		}
		if (quantity != null) {
			transaction.setQuantity(quantity);
		}
		
	    if (StringUtils.isNotEmpty(buyOrSell)) {
	    	transaction.setTradeType(TradeType.valueOf(buyOrSell));
	    }
	    
	    transaction.setTradeActionType(TradeActionType.CANCEL);

	    transactionRepository.save(transaction);
	}
	
	public List<Transaction> findByTransactionId(Integer transactionId) {
		Objects.requireNonNull(transactionId);
		
		return transactionRepository.findByTransactionId(transactionId);
	}
}

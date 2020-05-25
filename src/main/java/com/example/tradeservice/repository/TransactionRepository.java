package com.example.tradeservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository<Transaction> extends CrudRepository<Transaction, Integer> {
	com.example.tradeservice.entity.Transaction findByTransactionIdAndTradeId(Integer transactionId, Integer tradeId);
	 
	List<com.example.tradeservice.entity.Transaction> findByTransactionId(Integer transactionId);
}

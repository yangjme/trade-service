package com.example.tradeservice.repository;

import java.util.List;

import com.example.tradeservice.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	Transaction findByTransactionIdAndTradeId(Integer transactionId, Integer tradeId);
	 
	List<Transaction> findByTransactionId(Integer transactionId);
}

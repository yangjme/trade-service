package com.example.tradeservice.controller;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.tradeservice.entity.Transaction;
import com.example.tradeservice.requestparam.CreateTransactionParam;
import com.example.tradeservice.requestparam.UpdateTransactionParam;
import com.example.tradeservice.response.Position;
import com.example.tradeservice.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;

	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody CreateTransactionParam param) {
		transactionService.insertTransaction(param.getTradeId(), param.getSecurityCode(), 
				param.getQuantity(), param.getBuyOrSell());
		
	}
	
	@PutMapping("")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@RequestBody UpdateTransactionParam param) {
		transactionService.updateTransaction(param.getTransactionId(), param.getTradeId(), param.getSecurityCode(), 
				param.getQuantity(), param.getBuyOrSell());
	}
	
	@GetMapping("/{transactionId}")
	public List<Position> getPositionsOfTransaction(@PathVariable Integer transactionId) {
		List<Transaction> trans = transactionService.findByTransactionId(transactionId);
		
		if (trans != null && !trans.isEmpty()) {
			return trans.stream().map(o -> new Position(o.getSecurityCode().toString(), o.getQuantity()))
					.collect(Collectors.toList());
		}
		
		return Collections.emptyList();
	}
	
	
}

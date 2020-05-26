package com.example.tradeservice.entity;

import javax.persistence.*;

import com.example.tradeservice.enums.SecurityCode;
import com.example.tradeservice.enums.TradeActionType;
import com.example.tradeservice.enums.TradeType;

import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TransactionId")
	private Integer transactionId;

	@Column(name = "TradeId")
	private Integer tradeId;

	@Version
	@Column(name = "Version")
	private Integer version;

	@Column(name = "SecurityCode")
	private SecurityCode securityCode;

	@Column(name = "Quantity")
	private Integer quantity;
	@Enumerated(EnumType.STRING)

	@Column(name = "TradeActionType")
	private TradeActionType tradeActionType;
	@Enumerated(EnumType.STRING)

	@Column(name = "BuyOrSell")
	private TradeType tradeType;
}

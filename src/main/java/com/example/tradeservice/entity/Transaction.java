package com.example.tradeservice.entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.tradeservice.enums.SecurityCode;
import com.example.tradeservice.enums.TradeActionType;
import com.example.tradeservice.enums.TradeType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "Transactions")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer transactionId;
	private Integer tradeId;
	private Integer version;
	private SecurityCode securityCode;
	private Integer quantity;
	@Enumerated(EnumType.STRING)
	private TradeActionType tradeActionType;
	@Enumerated(EnumType.STRING)
	private TradeType tradeType;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getTradeId() {
		return tradeId;
	}

	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public SecurityCode getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(SecurityCode securityCode) {
		this.securityCode = securityCode;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public TradeActionType getTradeActionType() {
		return tradeActionType;
	}

	public void setTradeActionType(TradeActionType tradeActionType) {
		this.tradeActionType = tradeActionType;
	}

	public TradeType getTradeType() {
		return tradeType;
	}

	public void setTradeType(TradeType tradeType) {
		this.tradeType = tradeType;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((securityCode == null) ? 0 : securityCode.hashCode());
		result = prime * result + ((tradeActionType == null) ? 0 : tradeActionType.hashCode());
		result = prime * result + ((tradeId == null) ? 0 : tradeId.hashCode());
		result = prime * result + ((tradeType == null) ? 0 : tradeType.hashCode());
		result = prime * result + ((transactionId == null) ? 0 : transactionId.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (securityCode != other.securityCode)
			return false;
		if (tradeActionType != other.tradeActionType)
			return false;
		if (tradeId == null) {
			if (other.tradeId != null)
				return false;
		} else if (!tradeId.equals(other.tradeId))
			return false;
		if (tradeType != other.tradeType)
			return false;
		if (transactionId == null) {
			if (other.transactionId != null)
				return false;
		} else if (!transactionId.equals(other.transactionId))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", tradeId=" + tradeId + ", version=" + version
				+ ", securityCode=" + securityCode + ", quantity=" + quantity + ", tradeActionType=" + tradeActionType
				+ ", tradeType=" + tradeType + "]";
	}
	
	
}

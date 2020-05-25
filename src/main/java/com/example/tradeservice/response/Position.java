package com.example.tradeservice.response;

public class Position {
	private String SecurityCode;
	private Integer quantity;
	public Position(String securityCode, Integer quantity) {
		super();
		SecurityCode = securityCode;
		this.quantity = quantity;
	}
	public String getSecurityCode() {
		return SecurityCode;
	}
	public void setSecurityCode(String securityCode) {
		SecurityCode = securityCode;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Position [SecurityCode=" + SecurityCode + ", quantity=" + quantity + "]";
	}
   
}

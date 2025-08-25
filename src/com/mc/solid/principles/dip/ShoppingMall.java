package com.mc.solid.principles.dip;

public class ShoppingMall {
	
	private DebitCard debitCard;
	private CreditCard creditCard;

	public ShoppingMall(DebitCard debitCard) {
		this.debitCard = debitCard;
	}
	
	public ShoppingMall(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public void doPaymentDC(int amount) {
		debitCard.doTransaction(amount);
	}
	
	public void doPaymentCC(int amount) {
		creditCard.doTransaction(amount);
	}
}

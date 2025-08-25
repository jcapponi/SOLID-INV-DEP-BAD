package com.mc.solid.principles.dip;

public class TestPaymentCreditcard {
	public static void main(String[] args) {
		CreditCard creditCard = new CreditCard();
		ShoppingMall shoppingMallCC = new ShoppingMall(creditCard);
		shoppingMallCC.doPaymentCC(15000);
		
	}
}

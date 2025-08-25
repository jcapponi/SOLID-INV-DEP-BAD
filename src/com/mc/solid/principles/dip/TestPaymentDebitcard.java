package com.mc.solid.principles.dip;

public class TestPaymentDebitcard {
	public static void main(String[] args) {
		DebitCard debitCard = new DebitCard();
		ShoppingMall shoppingMall = new ShoppingMall(debitCard);
		shoppingMall.doPaymentDC(5000);
	}
}
 
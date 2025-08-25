package com.mc.solid.principles.dip;

public class CreditCard {
	public void doTransaction(int amount) {
		System.out.println("Transacción pagada con CreditCard " + amount);
	}
}

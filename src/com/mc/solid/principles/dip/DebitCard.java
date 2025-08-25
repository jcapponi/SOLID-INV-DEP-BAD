package com.mc.solid.principles.dip;

public class DebitCard {
	public void doTransaction(int amount) {
		System.out.println("Transacción pagada con DebitCard " + amount);
	}
}

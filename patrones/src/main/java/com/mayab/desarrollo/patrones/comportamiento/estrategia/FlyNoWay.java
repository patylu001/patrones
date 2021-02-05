package com.mayab.desarrollo.patrones.comportamiento.estrategia;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}

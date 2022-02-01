package com.mayab.desarrollo.patrones.comportamiento.estrategia;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}

package com.mayab.desarrollo.patrones.comportamiento.estrategia;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}

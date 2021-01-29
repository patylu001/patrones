package com.mayab.desarrollo.patrones.comportamiento.observer.clima;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}

package com.mayab.desarrollo.patrones.dependency;

public class Venta {
	private String nombre;
	private int precio;
	private Empleado empleado;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Empleado getEmpleado()
	{
		return empleado;
	}
	
	public Venta(String nombre, int precio, Empleado e)
	{
		this.nombre = nombre;
		this.precio = precio;
		this.empleado = e;
	}
}

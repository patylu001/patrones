package com.mayab.desarrollo.patrones.dependency;

public class Empleado {
	private String name = "";
	private String type = "";
	
	public Empleado(String name, String type)
	{
		this.name = name;
		this.type = type;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getType()
	{
		return type;
	}
}

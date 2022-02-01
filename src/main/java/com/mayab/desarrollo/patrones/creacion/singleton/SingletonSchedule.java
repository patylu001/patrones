package com.mayab.desarrollo.patrones.creacion.singleton;


import java.util.HashMap;
import java.util.Map;

//Un profesor da clases en 3 escuelas, los coordinadores de las 3escuelas tienen que acceder a la misma instancia
//para poder garantizar que estan viendo el mismo horario.
//Van a asignar una clase cada uno de ellos.

public class SingletonSchedule {
	//Hashmap
	//lun-4pm : claseA
	//lun-5pm : claseB
	//..

	private HashMap<String,String> schedule = new HashMap<String,String>();
	private static SingletonSchedule instance;
	
	private SingletonSchedule()
	{
		
	}
	
	public static SingletonSchedule getInstance()
	{
		if (instance == null)
			instance = new SingletonSchedule();
		return instance;
	}
	
	public void agregarClase(String hora,String clase)
	{
		schedule.put(hora, clase);
	}
	
	public void print()
	{
		for (Map.Entry me : schedule.entrySet()) {
	          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
	        }
	}
}

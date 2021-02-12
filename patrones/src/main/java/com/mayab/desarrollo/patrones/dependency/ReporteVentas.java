package com.mayab.desarrollo.patrones.dependency;

import java.util.ArrayList;
import java.util.List;

public class ReporteVentas implements Reporte {
	
	
	List<Venta> ventas = new ArrayList<Venta>();
	public ReporteVentas(List<Venta> ventas)
	{
		this.ventas = ventas;
	}
	public void leer() {
		// TODO Auto-generated method stub
		System.out.println("leyendo venta de empleado: ");// + empleado.getName());
	}

	public void escribir() {
		// TODO Auto-generated method stub
		
	
		for(Venta venta :ventas)
		{
			System.out.println("Venta: " + venta.getNombre() + " E = " + venta.getEmpleado().getName()) ;
		}
	}
	
	

}

package com.mayab.desarrollo.patrones.dependency;

import java.util.ArrayList;
import java.util.List;

public class ServicioDatosVentas implements IServicioDatosVentas {
	private List<Venta> allVentas = new ArrayList<Venta>();
	
	public ServicioDatosVentas()
	{	
		allVentas.clear();
	}
	
	public void addVenta(Venta v)
	{
		allVentas.add(v);
	}
	public List<Venta> getAllVentas()
	{
		return allVentas;
	}
	public List<Venta> getVentasByEmpleado(Empleado e)
	{
		List<Venta> allVentasEmp = new ArrayList<Venta>();
		for (Venta v: allVentas)
		{
			if(v.getEmpleado().getName() == e.getName())
				allVentasEmp.add(v);
		}
		return allVentasEmp;
	}

	

	
	
}

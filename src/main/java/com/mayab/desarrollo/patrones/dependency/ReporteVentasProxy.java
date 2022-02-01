package com.mayab.desarrollo.patrones.dependency;

public class ReporteVentasProxy implements Reporte{
	private ReporteVentas rv;
	private Empleado empleado ;
	private IServicioDatosVentas servicio;
	public ReporteVentasProxy(Empleado e,IServicioDatosVentas servicio)
	{
		empleado = e;		
		this.servicio = servicio;
	}


	public void leer() {
		rv.leer();
		
	}


	public void escribir() {
		
		
		if (empleado.getType() == "S")
		{
			rv = new ReporteVentas(servicio.getAllVentas());			
		}
		else
		{
			rv = new ReporteVentas(servicio.getVentasByEmpleado(empleado));
			
		}
		rv.escribir();
	}
	
	 
}

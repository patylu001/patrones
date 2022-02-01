package com.mayab.desarrollo.patrones.dependency;


public class DriverReporte {
	public static void main(String[] args) {
			Empleado vendedor = new Empleado("v1","V");
			Empleado supervisor = new Empleado("s1","S");
			ServicioDatosVentas servicio = new ServicioDatosVentas();
			
			Venta v = new Venta("p1",1,vendedor);
			servicio.addVenta(v);
			v = new Venta("p2",1,vendedor);
			servicio.addVenta(v);
			v = new Venta("p3",1,vendedor);
			servicio.addVenta(v);
			v = new Venta("p4",1,supervisor);
			servicio.addVenta(v);
			v = new Venta("p5",1,supervisor);
			servicio.addVenta(v);
			System.out.println("------- Vendedor ------");
			ReporteVentasProxy proxy = new ReporteVentasProxy(vendedor, servicio);
			proxy.escribir();
			System.out.println("------- Supervisor ------");
			proxy = new ReporteVentasProxy(supervisor, servicio);
			proxy.escribir();
			
	}
}

package com.mayab.desarrollo.patrones.creacion.singleton;

public class SingletonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coordinador coor1 = new Coordinador("nombre1","escuela1");
		Coordinador coor2 = new Coordinador("nombre2","escuela2");
		Coordinador coor3 = new Coordinador("nombre3","escuela3");
		
		coor1.agregarClase("lun4pm", "clase1");
		coor2.agregarClase("lun5pm", "clase2");
		coor3.agregarClase("lun6pm", "clase3");
		
		System.out.println("Done!");
		SingletonSchedule.getInstance().print();
	}

}

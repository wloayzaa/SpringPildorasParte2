package es.pildoras.annotationspr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotations2 {
	
	
////////////////////SPRING PILDORAS CLASE 23//////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	ClassPathXmlApplicationContext contexto2 = new ClassPathXmlApplicationContext("appContexto.xml");
		
		AnnotationConfigApplicationContext contexto2 = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		Empleados EmpleadoA = contexto2.getBean("ComercialExperimentadopr", Empleados.class);
		Empleados EmpleadoB = contexto2.getBean("ComercialExperimentadopr", Empleados.class);
		
		System.out.println(EmpleadoA);
		System.out.println(EmpleadoB);
		
		contexto2.close();
	}
	
	ClassPathXmlApplicationContext contexto2 = new ClassPathXmlApplicationContext("appContexto.xml");


}

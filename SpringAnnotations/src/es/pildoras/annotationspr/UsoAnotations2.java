package es.pildoras.annotationspr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotations2 {
	
	
////////////////////SPRING PILDORAS CLASE 24 //////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	ClassPathXmlApplicationContext contexto2 = new ClassPathXmlApplicationContext("appContexto.xml");
		
		AnnotationConfigApplicationContext contexto2 = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//Pedir un bean al contenedor
		Empleados empleado = contexto2.getBean("directorFinanciero", Empleados.class);
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());

		contexto2.close();
	}
	
	ClassPathXmlApplicationContext contexto2 = new ClassPathXmlApplicationContext("appContexto.xml");


}

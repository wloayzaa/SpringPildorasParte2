package es.pildoras.annotationspr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotations2 {
	
	


	public static void main(String[] args) {

		
	//	ClassPathXmlApplicationContext contexto2 = new ClassPathXmlApplicationContext("appContexto.xml");
		
		//SPRING PILDORAS CLASE 25 

		AnnotationConfigApplicationContext contexto2 = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//Se usa DirectorFinanciero ya que los metodos que se prentede leer solo pertenecen a director financiero y no a la interface que implementaba o sea empleados
		//Esto hace que se deba cambiar el .class
		
		// Empleados empleado = contexto2.getBean("directorFinanciero", Empleados.class); 
		DirectorFinanciero directorFinanciero = contexto2.getBean("directorFinanciero", DirectorFinanciero.class);
		System.out.println("Este es el email del archivo 'datosEmpresas.propiedades' :" + directorFinanciero.getEmail());
		contexto2.close();
	}
	
	ClassPathXmlApplicationContext contexto2 = new ClassPathXmlApplicationContext("appContexto.xml");


}

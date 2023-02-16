package es.pildoras.annotationspr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotations2 {
	
	
	//<!-- VIDEO 21 @SCOPE("prototype") hace que las instancias de los objetos tengan referencia de memoria diferentes -->
		//<!-- 1 Spring por defecto esta en "singleton" aunque al imprimir la instancia sin @scope el lugar del HEAP es diferente que con @scope " -->


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext contexto2 = new ClassPathXmlApplicationContext("appContexto.xml");
		
		Empleados EmpleadoA = contexto2.getBean("ComercialExperimentadopr", Empleados.class);
		Empleados EmpleadoB = contexto2.getBean("ComercialExperimentadopr", Empleados.class);
		
		System.out.println(EmpleadoA);
		System.out.println(EmpleadoB);
		
		contexto2.close();
	}

}

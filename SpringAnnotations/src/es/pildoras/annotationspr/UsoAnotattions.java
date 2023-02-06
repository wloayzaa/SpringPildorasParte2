package es.pildoras.annotationspr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotattions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//<!-- VIDEO 17 INYECCION EN EL CONSTRUCTORI CON AUTOWIRED-->
		//<!--  NO SE TOCA ESTA CLASE-->
	
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("appContexto.xml");
		
		Empleados pr = contexto.getBean("ComercialExperimentadopr", Empleados.class);
		
		System.out.println(pr.getTareas());
		System.out.println(pr.getInforme());
		
		contexto.close();

	}

}

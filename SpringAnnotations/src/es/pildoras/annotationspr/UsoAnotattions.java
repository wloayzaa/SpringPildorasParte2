package es.pildoras.annotationspr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotattions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//<!-- VIDEO 16 -->
		//<!-- 1 Se prepara Spring para que por medio de la recursividad lea las anotaciones dadas en el paquete indicado -->
		//<!-- 2 Se agregan las anotaciones en este caso "@Component("ComercialExperimentadopr")" -->
		//<!-- 3 Se pide el bean -->
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("appContexto.xml");
		
		Empleados pr = contexto.getBean("ComercialExperimentadopr", Empleados.class);
		
		System.out.println(pr.getTareas());
		System.out.println(pr.getInforme());
		
		contexto.close();

	}

}

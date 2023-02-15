package es.pildoras.annotationspr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



//<!-- 	VIDEO 16 -->
//<!-- 	1 Se prepara Spring para que por medio de la recursividad lea las anotaciones dadas en el paquete indicado -->
//<!-- 	2 Se agregan las anotaciones en este caso "@Component("ComercialExperimentadopr")"  -->


	//<!-- VIDEO 17 INYECCION EN EL CONSTRUCTORI CON AUTOWIRED-->
	//<!-- 1 Se crea interface y clase a inyectar -->
	//<!-- 2 Se crea //constructor a inyectar -->
	//<!-- 3 Se agregan las anotaciones "@Component" en "class InformeFinancieroTrim1" y "@Autowired" en el constructor y se llama 
	//		en el metodo getInforme() por medio de "informeFinanciero.getInformeFinanciero()" los metodos de la clase inyectada  -->

//<!-- VIDEO 18 INYECCION EN EL CONSTRUCTORI CON AUTOWIRED-->
//<!-- 1 Si la clase solo tiene un constructor no es necesario el "@Autowired" -->


//<!-- VIDEO 19 INYECCION EN EL CONSTRUCTORI CON AUTOWIRED-->
//<!-- 1 Se puede hacer una inyeccion usando un constructor/ un Setter / o cualquiera // y un campo de clase con "@Autowired" -->
@Component("ComercialExperimentadopr")
public class ComercialExperimentado implements Empleados {
	//constructor a inyectar  con un Campo de Clase --> 
	
	//<!-- VIDEO 20 @QUALIFIER especifica el ID del BEAN cuando es mas hay mas de una clase que implementan "CreacionInformeFinanciero"-->
	//<!-- 1 Se puede hacer una inyeccion usando un constructor/ un Setter / o cualquiera // y un campo de clase con "@Autowired" -->
	
	@Qualifier("informeFinancieroTrim2")
	@Autowired
	private CreacionInformeFinanciero informeFinanciero;
	
	
	//constructor a inyectar  con un Setter -->
	/////////////////////////////////////////////////////////
//	@Autowired
//	public void setInformeFinanciero(CreacionInformeFinanciero informeFinanciero) {
//		this.informeFinanciero = informeFinanciero;
//	}
	/////////////////////////////////////////////////////////
	
	//constructor a inyectar  con un Metodo cualquiera --> 
	
//	@Autowired
//
//	public void probandoNombreDeMetodo(CreacionInformeFinanciero informeFinanciero) {
//
//		this.informeFinanciero = informeFinanciero;
//
//	}
//	
//	@Autowired
//	public ComercialExperimentado(CreacionInformeFinanciero informeFinanciero) {
//		super();
//		this.informeFinanciero = informeFinanciero;
//	}

	@Override
	public String getTareas() {
		// TODO Auto-generated de method stub
		return "vender y vender";
	}

	

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}

}

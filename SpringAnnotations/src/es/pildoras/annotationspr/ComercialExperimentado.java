package es.pildoras.annotationspr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

//<!-- VIDEO 21 @SCOPE("prototype") hace que las instancias de los objetos tengan referencia de memoria diferentes -->
	//<!-- 1 Spring por defecto esta en "singleton" aunque al imprimir la instancia sin @scope el lugar del HEAP es diferente que con @scope " -->
@Scope("singleton")
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
	

/////////////////////SPRING PILDORAS CLASE 22/////////////////////////////////
/////////////////////////////////////////////////////////////////////////
	
	
	@PostConstruct
	public void ejetutaDespuesDeCreacionDelBean () {
		
		System.out.println("Antes de instaciacion");
		
	}
	
	@PreDestroy
	public void ejetutaAntesDeCreacionDelBean () {
		
		System.out.println("Despues de destruir bean ");
		
	}
	
/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
	

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

package es.pildoras.annotationspr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("singleton")
@Component("ComercialExperimentadopr")
public class ComercialExperimentado implements Empleados {

	
	@Qualifier("informeFinancieroTrim2")
	@Autowired
	private CreacionInformeFinanciero informeFinanciero;
	

	
//	@PostConstruct
//	public void ejetutaDespuesDeCreacionDelBean () {
//		
//		System.out.println("Antes de instaciacion");
//		
//	}
//	
//	@PreDestroy
//	public void ejetutaAntesDeCreacionDelBean () {
//		
//		System.out.println("Despues de destruir bean ");
//		
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

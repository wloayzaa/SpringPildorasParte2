package es.pildoras.annotationspr;

import org.springframework.stereotype.Component;




//<!-- 	VIDEO 16 -->
//<!-- 	1 Se prepara Spring para que por medio de la recursividad lea las anotaciones dadas en el paquete indicado -->
//<!-- 	2 Se agregan las anotaciones en este caso "@Component("ComercialExperimentadopr")"  -->

@Component("ComercialExperimentadopr")
public class ComercialExperimentado implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated de method stub
		return "vender y vender";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informar";
	}

}

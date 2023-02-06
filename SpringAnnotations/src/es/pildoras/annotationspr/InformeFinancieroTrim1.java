package es.pildoras.annotationspr;

import org.springframework.stereotype.Component;




//<!-- VIDEO 17 INYECCION EN EL CONSTRUCTORI CON AUTOWIRED-->
//<!-- 1 Se crea interface y clase a inyectar -->
@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "informe financiero del trimestre uno";
	}

}

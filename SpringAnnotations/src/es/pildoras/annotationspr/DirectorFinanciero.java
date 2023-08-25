package es.pildoras.annotationspr;

public class DirectorFinanciero implements Empleados {

	private CreacionInformeFinanciero inFro;
	
	public DirectorFinanciero (CreacionInformeFinanciero inFinanciero) {
		
		this.inFro = inFinanciero ;
	}
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Director Financiero gestiona empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return inFro.getInformeFinanciero();
	}
	
	

}

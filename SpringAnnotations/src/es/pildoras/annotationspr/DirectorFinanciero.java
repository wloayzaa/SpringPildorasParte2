package es.pildoras.annotationspr;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	private CreacionInformeFinanciero inFro;
	
	
	//SPRING PILDORAS CLASE 25 
	@Value("${email}")
	private String email ; 
	
	
	public String getEmail() {
		return email;
	}
	
	//SPRING PILDORAS CLASE 25 
	public void setEmail(String email) {
		this.email = email;
	}
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

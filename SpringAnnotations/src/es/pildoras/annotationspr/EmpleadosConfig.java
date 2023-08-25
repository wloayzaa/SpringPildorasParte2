package es.pildoras.annotationspr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("es.pildoras.annotationspr")
@Configuration
public class EmpleadosConfig {

	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() {

		return new InformeFinancieroDtoCompras();

	}

	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}

}

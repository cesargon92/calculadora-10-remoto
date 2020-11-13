package cl.devops.calculadora10.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculadoraConfig {

	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
}

package cl.devops.calculadora10.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CalculadoraRequestDTO {

	@NotNull(message = "El primer valor no puede ser nulo")
	@Pattern(regexp = "^\\d+(\\.\\d+)*$")
	private double primerValor;
	
	@NotNull(message = "El segundo valor no puede ser nulo")
	@Pattern(regexp = "^\\d+(\\.\\d+)*$")
	private double segundoValor;

	public double getPrimerValor() {
		return primerValor;
	}

	public void setPrimerValor(double primerValor) {
		this.primerValor = primerValor;
	}

	public double getSegundoValor() {
		return segundoValor;
	}

	public void setSegundoValor(double segundoValor) {
		this.segundoValor = segundoValor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CalculadoraRequestDTO [primerValor=");
		builder.append(primerValor);
		builder.append(", segundoValor=");
		builder.append(segundoValor);
		builder.append("]");
		return builder.toString();
	}
	
	
}

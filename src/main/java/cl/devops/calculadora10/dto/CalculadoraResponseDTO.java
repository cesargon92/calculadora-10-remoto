package cl.devops.calculadora10.dto;

public class CalculadoraResponseDTO {

	private double resultado;

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CalculadoraResponseDTO [resultado=");
		builder.append(resultado);
		builder.append("]");
		return builder.toString();
	}
	
	
}

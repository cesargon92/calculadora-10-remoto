package cl.devops.calculadora10.dto;

public class Calculadora {

	private double primerValor;
	
	private double segundoValor;
	
	private double resultado;
	

	public Calculadora() {
		super();
	}
	
	public Calculadora(double primerValor, double segundoValor, double resultado) {
		super();
		this.primerValor = primerValor;
		this.segundoValor = segundoValor;
		this.resultado = resultado;
	}

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

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Calculadora [primerValor=");
		builder.append(primerValor);
		builder.append(", segundoValor=");
		builder.append(segundoValor);
		builder.append(", resultado=");
		builder.append(resultado);
		builder.append("]");
		return builder.toString();
	}
	
	
}

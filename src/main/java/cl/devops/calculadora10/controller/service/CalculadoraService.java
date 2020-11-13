package cl.devops.calculadora10.controller.service;

import org.springframework.stereotype.Service;

import cl.devops.calculadora10.dto.Calculadora;

@Service
public class CalculadoraService {

	public Calculadora sumar(Calculadora calculadora) {
		double primerValor = calculadora.getPrimerValor();
		double segundoValor = calculadora.getSegundoValor();
		
		double resultado = primerValor + segundoValor;
		
		Calculadora newCalcu = new Calculadora();
		newCalcu.setResultado(resultado);
		
		return newCalcu;
	}
	
	public Calculadora multiplicar(Calculadora calculadora) {
		double primerValor = calculadora.getPrimerValor();
		double segundoValor = calculadora.getSegundoValor();
		
		double resultado = primerValor * segundoValor;
		
		Calculadora newCalcu = new Calculadora();
		newCalcu.setResultado(resultado);
		
		return newCalcu;
	}
	
	public Calculadora dividir(Calculadora calculadora) {
		double primerValor = calculadora.getPrimerValor();
		double segundoValor = calculadora.getSegundoValor();
		
		double resultado = primerValor / segundoValor;
		
		Calculadora newCalcu = new Calculadora();
		newCalcu.setResultado(resultado);
		
		return newCalcu;
	}

}

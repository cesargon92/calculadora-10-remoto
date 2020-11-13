package cl.devops.calculadora10.controller;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.devops.calculadora10.controller.service.CalculadoraService;
import cl.devops.calculadora10.dto.Calculadora;
import cl.devops.calculadora10.dto.CalculadoraRequestDTO;
import cl.devops.calculadora10.dto.CalculadoraResponseDTO;

@RestController
public class CalculadoraController {

	@Autowired
    private ModelMapper modelMapper;
	
	@Autowired
	private CalculadoraService calculadoraService;
	
	@PostMapping(path = "/sumar", consumes = "application/json", produces = "application/json")
	public CalculadoraResponseDTO sumar(@RequestBody @Valid CalculadoraRequestDTO request) {
		Calculadora calculadora = modelMapper.map(request, Calculadora.class);
		Calculadora result = calculadoraService.sumar(calculadora);
		CalculadoraResponseDTO response = modelMapper.map(result, CalculadoraResponseDTO.class);
		return response;
	}
	
	@PostMapping(path = "/multiplicar", consumes = "application/json", produces = "application/json")
	public CalculadoraResponseDTO multplicar(@RequestBody @Valid CalculadoraRequestDTO request) {
		Calculadora calculadora = modelMapper.map(request, Calculadora.class);
		Calculadora result = calculadoraService.multiplicar(calculadora);
		CalculadoraResponseDTO response = modelMapper.map(result, CalculadoraResponseDTO.class);
		return response;
	}
	
	@PostMapping(path = "/dividir", consumes = "application/json", produces = "application/json")
	public CalculadoraResponseDTO dividir(@RequestBody @Valid CalculadoraRequestDTO request) {
		Calculadora calculadora = modelMapper.map(request, Calculadora.class);
		Calculadora result = calculadoraService.dividir(calculadora);
		CalculadoraResponseDTO response = modelMapper.map(result, CalculadoraResponseDTO.class);
		return response;
	}

}

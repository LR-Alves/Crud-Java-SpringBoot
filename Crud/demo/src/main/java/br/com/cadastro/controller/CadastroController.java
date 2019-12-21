package br.com.cadastro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroController {

	@RequestMapping(path = "/home")
	public String teteSpring() {

		return ("Teste SpringBoot");
	}

}

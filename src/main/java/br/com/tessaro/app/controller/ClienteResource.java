package br.com.tessaro.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class ClienteResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "Opa, ta funcionando";
	}

}

package br.org.generation.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ctrl + shift + o = importar biblioteca

@RestController
@RequestMapping("/hello") // Diz endereço onde será acessado
public class helloWorld {
	
	@GetMapping // Coloque a informação abaico no endereço
	
	public String hello() {
		return "Hello World! Hello Spring!";
	}

}


//ctrl + shift + o = importar biblioteca 
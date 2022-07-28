package br.org.generation.HelloWorld.controller;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ctrl + shift + o = importar biblioteca

@RestController
@RequestMapping("/bsm") // Diz endereço onde será acessado
public class bsms {
	
	@GetMapping // Coloque a informação abaico no endereço
	public ArrayList<String> bsm() {
		ArrayList<String> bsmLista = new ArrayList<>();
		bsmLista.add("           BSM'S      ");
		bsmLista.add("- Mentalidade de Crescimento");
		bsmLista.add("- Persistência");
		bsmLista.add("- Responsabilidade Pessoal ");
		bsmLista.add("- Orientação ao Futuro");
		bsmLista.add("- Comunicação");
		bsmLista.add("- Orientação ao Detalhe");
		bsmLista.add("- Proatividade");
		bsmLista.add("- Trabalho em equipe");
		
		
		return bsmLista;
	}

}



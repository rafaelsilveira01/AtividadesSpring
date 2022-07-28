package br.org.generation.HelloWorld.controller;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ctrl + shift + o = importar biblioteca

@RestController
@RequestMapping("/aprendizado") // Diz endereço onde será acessado
public class aprendizado {
	
	@GetMapping // Coloque a informação abaico no endereço
	public ArrayList<String> aprendizado() {
		ArrayList<String> conteudoDaSemana = new ArrayList<>();
		conteudoDaSemana.add("        APRENDIZADO DA SEMANA      ");
		conteudoDaSemana.add("- CRIAR BANCO DE DADOS");
		conteudoDaSemana.add("- CRIAR TABELAS");
		conteudoDaSemana.add("- RELACIONAR TABELAS");
		conteudoDaSemana.add("- Estrutura DER");
		
				
		
		return conteudoDaSemana;
	}

}



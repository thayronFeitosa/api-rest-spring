package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<Topico> lista(){
		Topico topico = new Topico("Duvidas", "duvida sobre string", new Curso("Spring", "java"));
		return Arrays.asList(topico, topico, topico);
	}

}

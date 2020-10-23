package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody
	public String HelloWord() {
		
		return "Hello word";
	}
	@RequestMapping("/teste")
	@ResponseBody
	public String Teste() {
		
		return "Hello teste";
	}

}

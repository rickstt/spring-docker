package br.com.projeto.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalController {
	
	@GetMapping("/home")
	public String home(){
		return "Bem-vindo(a) a página home";
	}
	
	@GetMapping("/clientes")
	public List<String> cliente() {
		List<String> cli = new ArrayList<String>();
		cli.add("Microsoft");
		cli.add("Google");
		cli.add("Samsung");
		cli.add("Apple");
		cli.add("Xiaomi");
		return cli;
	}
	
	@GetMapping("/contato")
	public String contato() {
		return "contato@spring-docker.com.br";
	}
}

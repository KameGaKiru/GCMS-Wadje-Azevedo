package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 

@Controller
public class TestePraticaIII {
	
	@RequestMapping("/pratica") 
	public @ResponseBody String greeting() { 
	return "fazer juncao de clone e original"; 
	} 
	//irei fazer um comentário e mudar aqui antes de fazer a juncao
	}


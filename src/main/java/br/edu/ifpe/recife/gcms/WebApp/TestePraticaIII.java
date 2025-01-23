package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 

@Controller
public class TestePraticaIII {
	
	@RequestMapping("/Mudaca") 
	public @ResponseBody String greeting() { 
	return "mudança feita para juntar e dar push no GIT"; 
	} 
	//irei fazer um comentário e mudar aqui antes de fazer a juncao
	}


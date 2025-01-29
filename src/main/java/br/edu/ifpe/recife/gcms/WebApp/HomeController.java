package br.edu.ifpe.recife.gcms.WebApp;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
@Controller 
public class HomeController { 
@RequestMapping("/Wadje") 
public @ResponseBody String greeting() { 
return "Hello, Wadje!"; 
} 

@RequestMapping("/hotfix") 
public @ResponseBody String greeting() { 
return "Hello, Wadje (hotfix)!"; 
} 

}

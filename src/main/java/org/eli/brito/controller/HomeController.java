package org.eli.brito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/registro")
	public String registro() {
		return "registro";
	}
	
	@GetMapping("/login")
	public String login() {
		return "formLogin";
	}
	
	
	@GetMapping("/servicios")
	public String servicios() {
		return "servicios";
	}
	
	@GetMapping("/")
	public String mostrarIndex() {
		return "home";
	
}
	@GetMapping("/acerca")
	public String acerca() {
		return "acerca";
	}

}

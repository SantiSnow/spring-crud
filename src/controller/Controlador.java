package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Controlador {
	
	@RequestMapping("/clientes")
	public String listaClientes(Model miModelo) {
		return "clientes";
	}

}

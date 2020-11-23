package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Cliente;

@Controller
@RequestMapping("/")
public class Controlador {
	
	@Autowired
	private IClienteDao iClienteDao;
	
	@RequestMapping("/clientes")
	public String listaClientes(Model miModelo) {
		List<Cliente> misClientes = iClienteDao.getClientes();
		
		miModelo.addAttribute("misClientes", misClientes);
		
		return "clientes";
	}
	
	

}

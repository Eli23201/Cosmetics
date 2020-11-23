package org.eli.brito.controller;



import java.util.List;

import org.eli.brito.model.Producto;
import org.eli.brito.service.IntProductosSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/view/productos")
public class ProductoController {
	
	@Autowired
	private IntProductosSevice productosService;
	
	@GetMapping("/eliminar")
	public String eliminar() {
		 return "view/productos/listaProducto"; 
	}
	
    
    @GetMapping("/index")
    public String mostrarIndex(Model model) {
    	List<Producto> productos = productosService.ObtenerTodos();
    	System.out.println(productos);
    	for (Producto p : productos) {
    		System.out.println(p);	
    	}
    	model.addAttribute("productos",  productos);
        return "view/productos/listaProducto";
    }
}

 



		

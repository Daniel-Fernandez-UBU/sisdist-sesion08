package es.ubu.lsi.webForm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * BasicController.
 * 
 * Controlador básico para la carga y prueba
 * de las diferentes páginas de html así como del envío de parámetros
 * al html de resultados.
 * 
 * @author Daniel Fernández Barrientos
 * @version 1.0
 * 
 */

@Controller
public class BasicController {
	
	
	/**
	 * Método home.
	 * 
	 * @return la página home.html
	 */
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	/**
	 * 
	 * Método jsForm.
	 * 
	 * @return jsForm.html
	 */
	@GetMapping("/js")
	public String jsForm() {
		return "jsForm";
	}
	
	/**
	 * 
	 * Método jsForm.
	 * 
	 * @return jsForm.html
	 */
	@GetMapping("/html")
	public String htmlForm() {
		return "htmlForm";
	}
	
	/**
	 *
	 * Método results.
	 * 
	 * @param att1 - campo 1 del formulario
	 * @param att2 - campo 2 del formulario
	 * @param att3 - campo 3 del formulario
	 * @param model - variable que contiene los campos anterior y que se envía a resultados.html
	 * @return results.html
	 */
	@PostMapping("/finish")
	public String results(@RequestParam("att1") String att1, @RequestParam("att2") String att2, @RequestParam("att3") String att3, Model model) {
		
		model.addAttribute("att1", att1);
		model.addAttribute("att2", att2);
		model.addAttribute("att3", att3);
		
		return "results";
	}

}

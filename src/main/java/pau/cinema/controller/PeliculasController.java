package pau.cinema.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pau.cinema.model.Pelicula;
import pau.cinema.service.IPeliculasService;

@Controller
@RequestMapping("peliculas")
public class PeliculasController {
	
	@Autowired
	private IPeliculasService servicePeliculas;

	
	
        
        @GetMapping("/delete/{id}")
	public String verDelete(@PathVariable("id") int idPelicula, Model model) {
		
		Pelicula pelicula = servicePeliculas.buscarPorId(idPelicula);
		System.out.println("Pelicula: " + pelicula);
		model.addAttribute("infoPelicula", pelicula);
		return "mensaje";
	}
	
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idPelicula, Model model) {
		
		Pelicula pelicula = servicePeliculas.buscarPorId(idPelicula);
		
		
		System.out.println("Pelicula: " + pelicula);
		
		
		model.addAttribute("infoPelicula", pelicula);
		
		return "infoPelicula";
	}
        
        

}

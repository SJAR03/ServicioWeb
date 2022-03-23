package ni.edu.uca.ConexionBD.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ni.edu.uca.ConexionBD.models.Pelicula;
import ni.edu.uca.ConexionBD.services.PeliculaService;

@RestController
@RequestMapping(path = "/pelicula")
public class PeliculaController {

	@Autowired
	PeliculaService peliservice;
	
	
	@GetMapping("/listar")
	public List<Map<String, Object>> listar() {
		return peliservice.MostrarRegistro();
	}

	@PostMapping("/agregar")
	public String agregarPel(@RequestBody Pelicula pelicula) {
		String msg="Error al guardar registro.....";
		int b = peliservice.GuardarRegistro(pelicula);
		if(b==1)msg="Guardado Exitosamente ....";
		return msg;
	}
	
	@PutMapping("/actualizar/{id}")
	public String editarPel(@RequestBody Pelicula pelicula, @PathVariable int id, Model model) {
		String msg = "ERROR AL ACTUALIZAR EL REGISTRO....";
		int b = peliservice.EditarRegistro(pelicula);
		if(b==1)msg= "Actualizado Correctamente !";
		return msg;
	} 
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminarPel(@PathVariable int id, Model model){
		String msg = "Error al eliminar el registro ...";
		int b = peliservice.EliminarRegistro(id);
		if(b==1)msg = "SE ELIMINO CORRECTAMENTE !";
		return msg;
	}
	
}

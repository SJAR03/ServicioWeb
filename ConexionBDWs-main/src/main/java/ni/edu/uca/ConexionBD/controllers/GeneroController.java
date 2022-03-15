package ni.edu.uca.ConexionBD.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ni.edu.uca.ConexionBD.models.Genero;
import ni.edu.uca.ConexionBD.services.GeneroService;

@RestController
@RequestMapping (path = "/genero")
public class GeneroController {
	
	@Autowired
	GeneroService genS;
	
	@RequestMapping ("/listar")
	public List<Map<String, Object>> listar(){
		return genS.MostrarRegistro();
	}
	
	@PostMapping ("/agregar")
	public String AgregarGen(@RequestBody Genero gen) {
		String msg = "Error al guardar registro...";
		int b = genS.GuardarRegistro(gen);
		if (b==1) msg = "Registro guardado exitosamente...";
		return "";
	}
	
	@PutMapping("/actualizar/{id}")
	public String editarGen(@RequestBody Genero gen, @PathVariable int id, Model model) {
		String msg = "Error al guardar el registro...";
		gen.setIdGenero(id);
		int b = genS.EditarRegistro(gen);
		if (b==1) msg = "Cambios realizados exitosamente...";
		return msg;
	}
	
	@DeleteMapping("eliminar/{id}")
	public String eliminarGen(@PathVariable int id, Model model) {
		String msg = "Error al eliminar el registro...";
		int b = genS.EliminarRegistro(id);
		if (b==1) msg = "Registro eliminado...";
		return msg;
	}
}

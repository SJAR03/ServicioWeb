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

import ni.edu.uca.ConexionBD.models.Idioma;
import ni.edu.uca.ConexionBD.services.IdiomaService;

@RestController
@RequestMapping (path = "/idioma")
public class IdiomaController {

	@Autowired
	IdiomaService idiS;
	
	@RequestMapping ("/listar")
	public List<Map<String, Object>> listar(){
		return idiS.MostrarRegistro();
	}
	
	@PostMapping ("/agregar")
	public String AgregarIdi(@RequestBody Idioma idi) {
		String msg = "Error al guardar registro...";
		int b = idiS.GuardarRegistro(idi);
		if (b==1) msg = "Registro guardado exitosamente...";
		return "";
	}
	
	@PutMapping("/actualizar/{id}")
	public String editarIdi(@RequestBody Idioma idi, @PathVariable int id, Model model) {
		String msg = "Error al guardar el registro...";
		idi.setIdIdioma(id);
		int b = idiS.EditarRegistro(idi);
		if (b==1) msg = "Cambios realizados exitosamente...";
		return msg;
	}
	
	@DeleteMapping("eliminar/{id}")
	public String eliminarIdi(@PathVariable int id, Model model) {
		String msg = "Error al eliminar el registro...";
		int b = idiS.EliminarRegistro(id);
		if (b==1) msg = "Registro eliminado...";
		return msg;
	}
	
}

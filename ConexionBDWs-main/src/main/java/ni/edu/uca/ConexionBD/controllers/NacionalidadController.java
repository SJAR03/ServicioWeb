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

import ni.edu.uca.ConexionBD.models.Nacionalidad;
import ni.edu.uca.ConexionBD.services.NacionalidadService;

@RestController
@RequestMapping (path = "/nacionalidad")
public class NacionalidadController {

	@Autowired
	NacionalidadService nacS;
	
	@RequestMapping ("/listar")
	public List<Map<String, Object>> listar(){
		return nacS.MostrarRegistro();
	}
	
	@PostMapping ("/agregar")
	public String AgregarNac(@RequestBody Nacionalidad nac) {
		String msg = "Error al guardar registro...";
		int b = nacS.GuardarRegistro(nac);
		if (b==1) msg = "Registro guardado exitosamente...";
		return "";
	}
	
	@PutMapping("/actualizar/{id}")
	public String editarNac(@RequestBody Nacionalidad nac, @PathVariable int id, Model model) {
		String msg = "Error al guardar el registro...";
		nac.setIdNacionalidad(id);
		int b = nacS.EditarRegistro(nac);
		if (b==1) msg = "Cambios realizados exitosamente...";
		return msg;
	}
	
	@DeleteMapping("eliminar/{id}")
	public String eliminarNac(@PathVariable int id, Model model) {
		String msg = "Error al eliminar el registro...";
		int b = nacS.EliminarRegistro(id);
		if (b==1) msg = "Registro eliminado...";
		return msg;
	}
	
}

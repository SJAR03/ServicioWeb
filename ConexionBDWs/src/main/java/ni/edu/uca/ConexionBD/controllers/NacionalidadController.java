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

import ni.edu.uca.ConexionBD.models.Nacionalidad;
import ni.edu.uca.ConexionBD.services.NacionalidadService;

@RestController
@RequestMapping(path = "/nacionalidad")
public class NacionalidadController {

	@Autowired
	NacionalidadService nacionalidadservice;
	
	
	@GetMapping("/listar")
	public List<Map<String, Object>> listar() {
		return nacionalidadservice.MostrarRegistro();
	}

	@PostMapping("/agregar")
	public String agregarNac(@RequestBody Nacionalidad nacionalidad) {
		String msg="Error al guardar registro.....";
		int b = nacionalidadservice.GuardarRegistro(nacionalidad);
		if(b==1)msg="Guardado Exitosamente ....";
		return msg;
	}
	
	@PutMapping("/actualizar/{id}")
	public String editarNac(@RequestBody Nacionalidad nacionalidad, @PathVariable int id, Model model) {
		String msg = "ERROR AL ACTUALIZAR EL REGISTRO....";
		int b = nacionalidadservice.EditarRegistro(nacionalidad);
		if(b==1)msg= "Actualizado Correctamente !";
		return msg;
	} 
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminarNac(@PathVariable int id, Model model){
		String msg = "Error al eliminar el registro ...";
		int b = nacionalidadservice.EliminarRegistro(id);
		if(b==1)msg = "SE ELIMINO CORRECTAMENTE !";
		return msg;
	}
	
}

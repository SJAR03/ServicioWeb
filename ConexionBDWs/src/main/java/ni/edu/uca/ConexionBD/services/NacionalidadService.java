package ni.edu.uca.ConexionBD.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ni.edu.uca.ConexionBD.models.Nacionalidad;
import ni.edu.uca.ConexionBD.repositories.NacionalidadDRepository;
import ni.edu.uca.ConexionBD.repositories.NacionalidadIRepository;

@Service
public class NacionalidadService implements NacionalidadIRepository{

	@Autowired
	NacionalidadDRepository drNacionalidad;
	
	
	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		// TODO Auto-generated method stub
		return drNacionalidad.MostrarRegistro();
	}

	@Override
	public int GuardarRegistro(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		return drNacionalidad.GuardarRegistro(nacionalidad);
	}

	@Override
	public int EditarRegistro(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		return drNacionalidad.EditarRegistro(nacionalidad);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return drNacionalidad.EliminarRegistro(id);
	}
	
}

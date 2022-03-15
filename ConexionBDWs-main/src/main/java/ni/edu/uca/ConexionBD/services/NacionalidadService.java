package ni.edu.uca.ConexionBD.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ni.edu.uca.ConexionBD.models.Nacionalidad;
import ni.edu.uca.ConexionBD.repositories.NacionalidadRepository;

@Service
public class NacionalidadService implements NacionalidadRepository{

	@Autowired
	NacionalidadRepository dRNacionalidad;
	
	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		// TODO Auto-generated method stub
				return dRNacionalidad.MostrarRegistro();
	}

	@Override
	public int GuardarRegistro(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
				return dRNacionalidad.GuardarRegistro(nacionalidad);
	}

	@Override
	public int EditarRegistro(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
				return dRNacionalidad.EditarRegistro(nacionalidad);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
				return dRNacionalidad.EliminarRegistro(id);
	}

	
	
}

package ni.edu.uca.ConexionBD.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ni.edu.uca.ConexionBD.models.Genero;
import ni.edu.uca.ConexionBD.repositories.GeneroIRepository;
import ni.edu.uca.ConexionBD.repositories.GeneroDRepository;

@Service
public class GeneroService implements GeneroIRepository{

	@Autowired
	GeneroDRepository dRGenero;
	
	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		// TODO Auto-generated method stub
		return dRGenero.MostrarRegistro();
	}

	@Override
	public int GuardarRegistro(Genero genero) {
		// TODO Auto-generated method stub
		return dRGenero.GuardarRegistro(genero);
	}

	@Override
	public int EditarRegistro(Genero genero) {
		// TODO Auto-generated method stub
		return dRGenero.EditarRegistro(genero);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return dRGenero.EliminarRegistro(id);
	}

}

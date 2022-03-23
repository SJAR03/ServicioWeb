package ni.edu.uca.ConexionBD.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ni.edu.uca.ConexionBD.models.Pelicula;
import ni.edu.uca.ConexionBD.repositories.PeliculasDRepository;
import ni.edu.uca.ConexionBD.repositories.PeliculaIRepository;

@Service
public class PeliculaService implements PeliculaIRepository{

	@Autowired
	PeliculasDRepository drPeli;
	
	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		// TODO Auto-generated method stub
		return drPeli.MostrarRegistro();
	}

	@Override
	public int GuardarRegistro(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return drPeli.GuardarRegistro(pelicula);
	}

	@Override
	public int EditarRegistro(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return drPeli.EditarRegistro(pelicula);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return drPeli.EliminarRegistro(id);
	}
	
}

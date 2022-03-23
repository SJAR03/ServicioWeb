package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import ni.edu.uca.ConexionBD.models.Pelicula;

public interface PeliculaIRepository {

	public List<Map<String, Object>> MostrarRegistro();

	public int GuardarRegistro(Pelicula pelicula);

	public int EditarRegistro(Pelicula pelicula);

	public int EliminarRegistro(int id);
	
}

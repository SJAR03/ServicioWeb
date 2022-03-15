package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import ni.edu.uca.ConexionBD.models.Idioma;


public interface IdiomaRepository {
	
	public List<Map<String, Object>> MostrarRegistro();
	public int GuardarRegistro (Idioma idioma);
	public int EditarRegistro (Idioma idioma);
	public int EliminarRegistro (int id);

}

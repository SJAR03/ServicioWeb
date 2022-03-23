package ni.edu.uca.ConexionBD.repositories;

import java.util.Map;

import ni.edu.uca.ConexionBD.models.Genero;

import java.util.List;

public interface GeneroIRepository {

	public List<Map<String, Object>> MostrarRegistro();

	public int GuardarRegistro(Genero genero);

	public int EditarRegistro(Genero genero);

	public int EliminarRegistro(int id);

}

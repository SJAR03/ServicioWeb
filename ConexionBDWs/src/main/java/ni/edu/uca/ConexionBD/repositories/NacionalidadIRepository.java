package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import ni.edu.uca.ConexionBD.models.Nacionalidad;

public interface NacionalidadIRepository {

	public List<Map<String, Object>> MostrarRegistro();

	public int GuardarRegistro(Nacionalidad nacionalidad);

	public int EditarRegistro(Nacionalidad nacionalidad);

	public int EliminarRegistro(int id);
	
}

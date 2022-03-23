package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ni.edu.uca.ConexionBD.models.Nacionalidad;

@Repository
public class NacionalidadDRepository implements NacionalidadIRepository{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		List<Map<String, Object>> lista = template.queryForList("SELECT * FROM Nacionalidad");
		return lista;
	}

	@Override
	public int GuardarRegistro(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		int b =0;
		b = template.update("INSERT INTO Nacionalidad(nombre, activo) values (?,?)",
				new Object[] {nacionalidad.getNombre(), nacionalidad.isActivo()});
		return b;
	}

	@Override
	public int EditarRegistro(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		int b = 0;
		b = template.update("UPDATE Nacionalidad SET nombre = ?, activo = ? where idNacionalidad = ?",
				new Object[] {nacionalidad.getNombre(),nacionalidad.isActivo(),nacionalidad.getIdNacionalidad()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		int b = 0;
		b = template.update("DELETE FROM Nacionalidad WHERE idNacionalidad = ?", id);
		return b;
	}
	
}

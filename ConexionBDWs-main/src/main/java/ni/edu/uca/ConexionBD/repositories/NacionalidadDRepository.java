package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ni.edu.uca.ConexionBD.models.Nacionalidad;

@Repository
public class NacionalidadDRepository implements NacionalidadRepository{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		List<Map<String, Object>> lista = template.queryForList("Select * from Nacionalidad");
		return lista;
	}

	@Override
	public int GuardarRegistro(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		int b = 0;
		b = template.update("Insert into Nacionalidad (nombre, activo) values (?, ?)",
		new Object[] {nacionalidad.getNombre(), nacionalidad.isActivo()});
		return b;
	}

	@Override
	public int EditarRegistro(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		int b = 0;
		b = template.update("Update Nacionalidad set nombre = ?, activo = ? where idNacionalidad = ?",
				new Object[] {nacionalidad.getNombre(), nacionalidad.isActivo(), nacionalidad.getIdNacionalidad()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		int b = 0;
		b = template.update("Delete from Nacionalidad where idNacionalidad = ?", id);
		return b;
	}

	
	
}

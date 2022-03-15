package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ni.edu.uca.ConexionBD.models.Genero;

@Repository
public class GeneroDRepository implements GenerolRepository {

	@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> lista = template.queryForList("Select * from Genero");
		return lista;
	}

	@Override
	public int GuardarRegistro(Genero genero) {
		// TODO Auto-generated method stub
		int b = 0;
		b = template.update("Insert into Genero (nombre, activo) values (?, ?)",
		new Object[] {genero.getNombre(), genero.isActivo()});
		return b;
	}

	@Override
	public int EditarRegistro(Genero genero) {
		// TODO Auto-generated method stub
		int b = 0;
		b = template.update("Update Genero set nombre = ?, activo = ? where idGenero = ?",
				new Object[] {genero.getNombre(), genero.isActivo(), genero.getIdGenero()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		int b = 0;
		b = template.update("Delete from Genero where idGenero = ?", id);
		return b;
	}
	
	
	
}

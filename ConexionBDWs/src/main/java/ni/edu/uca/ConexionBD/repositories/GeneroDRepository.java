package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ni.edu.uca.ConexionBD.models.Genero;

@Repository
public class GeneroDRepository implements GeneroIRepository{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		List<Map<String, Object>> lista = template.queryForList("SELECT * FROM Genero");
		return lista;
	}

	@Override
	public int GuardarRegistro(Genero genero) {
		int b = 0;
		b = template.update("INSERT INTO Genero(nombre, activo) values (?,?)",
				new Object[] {genero.getNombre(), genero.isActivo()});
		return b;
	}

	@Override
	public int EditarRegistro(Genero genero) {
		int b = 0;
		b = template.update("UPDATE Genero SET nombre = ?, activo = ? where idGenero = ?",
				new Object[] {genero.getNombre(),genero.isActivo(),genero.getIdGenero()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		int b = 0;
		b = template.update("DELETE FROM Genero WHERE idGenero = ?", id);
		return b;
	}
	
}

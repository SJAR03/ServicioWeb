package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ni.edu.uca.ConexionBD.models.Idioma;

@Repository
public class IdiomaDRepository implements IdiomaIRepository{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> lista = template.queryForList("SELECT * FROM Idioma");
		return lista;
	}

	@Override
	public int GuardarRegistro(Idioma idioma) {
		int b = 0;
		b = template.update("INSERT INTO Idioma(nombre, activo) values (?,?)",
				new Object[] {idioma.getNombre(), idioma.isActivo()});
		return b;
	}

	@Override
	public int EditarRegistro(Idioma idioma) {
		int b = 0;
		b = template.update("UPDATE Idioma SET nombre = ?, activo = ? where idIdioma = ?",
				new Object[] {idioma.getNombre(),idioma.isActivo(),idioma.getIdIdioma()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		int b = 0;
		b = template.update("DELETE FROM Idioma WHERE idIdioma = ?", id);
		return b;
	}
	
}

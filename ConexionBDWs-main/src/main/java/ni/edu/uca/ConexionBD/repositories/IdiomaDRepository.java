package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ni.edu.uca.ConexionBD.models.Idioma;

@Repository
public class IdiomaDRepository implements IdiomaRepository{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		List<Map<String, Object>> lista = template.queryForList("Select * from Idioma");
		return lista;
	}

	@Override
	public int GuardarRegistro(Idioma idioma) {
		// TODO Auto-generated method stub
				int b = 0;
				b = template.update("Insert into Idioma (nombre, activo) values (?, ?)",
				new Object[] {idioma.getNombre(), idioma.isActivo()});
				return b;
	}

	@Override
	public int EditarRegistro(Idioma idioma) {
		// TODO Auto-generated method stub
				int b = 0;
				b = template.update("Update Idioma set nombre = ?, activo = ? where idIdioma = ?",
						new Object[] {idioma.getNombre(), idioma.isActivo(), idioma.getIdIdioma()});
				return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
				int b = 0;
				b = template.update("Delete from Idioma where idIdioma = ?", id);
				return b;
	}

}

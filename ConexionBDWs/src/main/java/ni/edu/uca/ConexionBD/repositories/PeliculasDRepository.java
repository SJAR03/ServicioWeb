package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ni.edu.uca.ConexionBD.models.Pelicula;

@Repository
public class PeliculasDRepository implements PeliculaIRepository{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		List<Map<String, Object>> lista = template.queryForList("SELECT * FROM Pelicula");
		return lista;
	}

	@Override
	public int GuardarRegistro(Pelicula pelicula) {
		int b =0;
		b = template.update("INSERT INTO Pelicula(titulo,tipoMetraje,nacionalidad,clasificacion,duracion,sinopsis) values (?,?,?,?,?,?)",
				new Object[] {pelicula.getTitulo(),pelicula.getTipoMetraje(),pelicula.getNacionalidad(),pelicula.getClasificacion(),pelicula.getDuracion(),pelicula.getSinopsis()});
		return b;
	}

	@Override
	public int EditarRegistro(Pelicula pelicula) {
		int b = 0;
		b = template.update("UPDATE Pelicula SET titulo = ?, tipoMetraje = ?, nacionalidad = ?, clasificacion = ? ,duracion = ?, sinopsis =? where idPelicula = ?",
				new Object[] {pelicula.getTitulo(),pelicula.getTipoMetraje(),pelicula.getNacionalidad(),pelicula.getClasificacion(),pelicula.getDuracion(),pelicula.getSinopsis(),pelicula.getIdPelicula()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		int b = 0;
		b = template.update("DELETE FROM Pelicula WHERE idPelicula = ?", id);
		return b;
	}
	
}

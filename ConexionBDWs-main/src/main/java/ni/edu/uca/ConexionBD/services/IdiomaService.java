package ni.edu.uca.ConexionBD.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ni.edu.uca.ConexionBD.models.Idioma;
import ni.edu.uca.ConexionBD.repositories.IdiomaRepository;

@Service
public class IdiomaService implements IdiomaRepository{

	@Autowired
	IdiomaRepository dRIdioma;

	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		// TODO Auto-generated method stub
		return dRIdioma.MostrarRegistro();
	}

	@Override
	public int GuardarRegistro(Idioma idioma) {
		// TODO Auto-generated method stub
		return dRIdioma.GuardarRegistro(idioma);
	}

	@Override
	public int EditarRegistro(Idioma idioma) {
		// TODO Auto-generated method stub
		return dRIdioma.EditarRegistro(idioma);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return dRIdioma.EliminarRegistro(id);
	}
	
}

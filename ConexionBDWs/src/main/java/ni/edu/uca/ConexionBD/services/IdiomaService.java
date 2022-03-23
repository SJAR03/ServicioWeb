package ni.edu.uca.ConexionBD.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ni.edu.uca.ConexionBD.models.Idioma;
import ni.edu.uca.ConexionBD.repositories.IdiomaDRepository;
import ni.edu.uca.ConexionBD.repositories.IdiomaIRepository;

@Service
public class IdiomaService implements IdiomaIRepository{

	@Autowired
	IdiomaDRepository drIdioma;
	
	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		// TODO Auto-generated method stub
		return drIdioma.MostrarRegistro();
	}

	@Override
	public int GuardarRegistro(Idioma idioma) {
		// TODO Auto-generated method stub
		return drIdioma.GuardarRegistro(idioma);
	}

	@Override
	public int EditarRegistro(Idioma idioma) {
		// TODO Auto-generated method stub
		return drIdioma.EditarRegistro(idioma);
	}

	@Override
	public int EliminarRegistro(int id) {
		return drIdioma.EliminarRegistro(id);
	}
	
}

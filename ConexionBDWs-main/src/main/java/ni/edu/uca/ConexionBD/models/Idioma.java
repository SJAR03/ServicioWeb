package ni.edu.uca.ConexionBD.models;

public class Idioma {

	
	private int idIdioma;
	private String nombre;
	private Boolean activo;
	
	public Idioma() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Idioma(int idIdioma, String nombre, Boolean activo) {
		super();
		this.idIdioma = idIdioma;
		this.nombre = nombre;
		this.activo = activo;
	}

	public int getIdIdioma() {
		return idIdioma;
	}

	public void setIdIdioma(int idIdioma) {
		this.idIdioma = idIdioma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean isActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	
	
}

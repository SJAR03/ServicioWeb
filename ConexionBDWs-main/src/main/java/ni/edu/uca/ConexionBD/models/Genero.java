package ni.edu.uca.ConexionBD.models;

public class Genero {

	private int idGenero;
	private String nombre;
	private Boolean activo;
	
	public Genero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genero(int idGenero, String nombre, Boolean activo) {
		super();
		this.idGenero = idGenero;
		this.nombre = nombre;
		this.activo = activo;
	}

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
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

package ni.edu.uca.ConexionBD.models;

public class Nacionalidad {

	private int idNacionalidad;
	private String nombre;
	private Boolean activo;
	
	public Nacionalidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nacionalidad(int idNacionalidad, String nombre, Boolean activo) {
		super();
		this.idNacionalidad = idNacionalidad;
		this.nombre = nombre;
		this.activo = activo;
	}

	public int getIdNacionalidad() {
		return idNacionalidad;
	}

	public void setIdNacionalidad(int idNacionalidad) {
		this.idNacionalidad = idNacionalidad;
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

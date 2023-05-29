package cl.dmiranda;

public class Persona {

	private String nombre;
	private String rut;
	
	public Persona(String nombre, String rut) {
		this.nombre=nombre;
		this.rut=rut;
	}
	public Persona ()  {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
}

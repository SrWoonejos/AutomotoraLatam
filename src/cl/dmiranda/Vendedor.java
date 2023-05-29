package cl.dmiranda;

public class Vendedor extends Persona{
private String direccion;
	
	public Vendedor(String nombre, String rut, String direccion) {
		super(nombre, rut);
		this.direccion=direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}

package cl.dmiranda;

public class Cliente extends Persona {
	
	private int edad;
	
	public Cliente(String nombre, String rut, int edad)  {
		super(nombre, rut);
		this.setEdad(edad);	
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
}

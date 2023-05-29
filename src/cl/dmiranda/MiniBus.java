package cl.dmiranda;

public class MiniBus extends Bus {  //public class Profesor extends Persona {
//atributos	
	private String tipoViaje;
//constructor
	public MiniBus (String color, String patente, String tipoViaje, int cantAsientos) {
		super(color, patente, cantAsientos);
		this.tipoViaje = tipoViaje;
	}
	public void miniBus ()  {	
	}

	//metodos
	public String getTipoViaje() {
		return tipoViaje;
	}

	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	} 
	public void imprimeBus () {
		System.out.println("Patente del Bus: " + this.getPatente() + "| Color: " + this.getColor() + "| Tipo de Viaje: " + this.getTipoViaje() + "| Cant. de asientos: " + this.getCantAsientos());
	}
	@Override
	public String toString() {
		return "MiniBus [tipoViaje=" + tipoViaje + "]";
	}
	
}

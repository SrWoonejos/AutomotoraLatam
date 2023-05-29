package cl.dmiranda;

public class Taxi extends Vehiculo{

	//atributos
	public int valorPasaje;
	public int pasajero;
	public int vuelto;
	
	//constructor
	public Taxi (String color, String patente, int valorPasaje, int pasajero, int vuelto) {  
		super(color, patente);
		this.valorPasaje=valorPasaje;
		this.pasajero=pasajero;
		this.vuelto=vuelto;
	}
	public Taxi ()  {
	}

	//get & set
	public int getPasaje() {
		return valorPasaje;
	}

	public void setPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}
	//met propio de la clase
	public void valorPasaje(int valorPasaje) {
		
	}
	
	public int pagarPasaje(int vuelto)  {
		if(pasajero >= valorPasaje) {
			return pasajero - valorPasaje;
		} else {
			return valorPasaje;	
		}
	}
	public String toString() {
		return "Valor Pasaje del Taxi: " + valorPasaje + " Pasajero: " +  pasajero + " Tu Vuelto es: " + vuelto;
	}

}

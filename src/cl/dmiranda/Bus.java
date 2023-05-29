package cl.dmiranda;

public class Bus extends Vehiculo {
	//Atributos son siempre privados
	private int cantidadDeAsientos;
    private int cantPasajeros = 40;
    private int pasaje = 1000;
    private int valorVencina = 1500;
	
	//Constructor
	public Bus (String color, String patente, int cantidadDeAsientos) {
		super (color, patente); //se hereda de la clase principal
		this.cantidadDeAsientos=cantidadDeAsientos;
	}
	public Bus ()  {
	}
	public void utilidad (int cantPasajeros, int pasaje) {
        System.out.println("UTILIDAD BUS: ");
        System.out.println("Diaria: " + (cantPasajeros * pasaje) * 4); 
        System.out.println("Semanal: " + (cantPasajeros * pasaje) * 4*7); 
        System.out.println("Mensual: " + (cantPasajeros * pasaje) * 4*30);
        System.out.println();
        
        this.cantPasajeros=cantPasajeros;
        this.pasaje=pasaje;
	}
	public void gastoVencina()  {
		System.out.println("GASTO VENCINA: ");
		System.out.println("Diario: " + (valorVencina * 60) * 4); 
        System.out.println("Semanal: " + (valorVencina * 60) * 4*7); 
        System.out.println("Mensual: " + (valorVencina * 60) * 4*30); 
        System.out.println();
	}
	
	//Metodos siempre publicos
	public int getCantAsientos() {
		return cantidadDeAsientos;
	}

	public void setCantAsientos(int cantidadDeAsientos) {
		this.cantidadDeAsientos = cantidadDeAsientos;
	} 
	public int asientosDisponibles() {
		return cantidadDeAsientos;	
	}
	public int getCantPasajeros() {
		return cantPasajeros;
	}
	public void setCantPasajeros(int cantPasajeros) {
		this.cantPasajeros = cantPasajeros;
	}	
	public int getPasaje() {
		return pasaje;
	}
	public void setPasaje(int pasaje) {
		this.pasaje = pasaje;
	}
	public int getCantidadDeAsientos() {
		return cantidadDeAsientos;
	}
	public void setCantidadDeAsientos(int cantidadDeAsientos) {
		this.cantidadDeAsientos = cantidadDeAsientos;
	}
	public int getValorVencina() {
		return valorVencina;
	}
	public void setValorVencina(int valorVencina) {
		this.valorVencina = valorVencina;
	}
	//@Override
	//public void toString() {
	public void cantidDeAsientos()  {
	System.out.println("Asientos disponibles: " + cantidadDeAsientos);
}
	}	
	
	
